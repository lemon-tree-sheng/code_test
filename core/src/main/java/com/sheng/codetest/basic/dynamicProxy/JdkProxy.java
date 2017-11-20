package com.sheng.codetest.basic.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shengxingyue, created on 2017/11/20
 * jdk 自带动态代理实现
 * 1、代理对象需要实现接口
 * 2、运行时拿到代理类接口动态生成字节码，由指定类装载器装载字节码，利用反射拿到构造器生成代理对象，调用对应方法
 */
public class JdkProxy {

    public static void main(String[] args) {
        // 生成代理类 todo .class 和 getClass() 的比较
        FooService fooService = new FooServiceImpl();
        FooService fooServiceProxy = (FooService) Proxy.newProxyInstance(FooService.class.getClassLoader(), fooService.getClass().getInterfaces(), new MyInvocationHandler(fooService));
        fooServiceProxy.sayHi();
    }
}

interface FooService {
    void sayHi();
}

class FooServiceImpl implements FooService {
    @Override
    public void sayHi() {
        System.out.println("hello world");
    }
}

/**
 * 切面逻辑写在这里
 */
class MyInvocationHandler implements InvocationHandler {
    Object object;

    MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method");
        Object o = method.invoke(object, args);
        System.out.println("after method");
        return o;
    }
}