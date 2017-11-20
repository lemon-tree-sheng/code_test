package com.sheng.codetest.basic.dynamicProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shengxingyue, created on 2017/11/20
 * cglib 动态代理方式：
 * 1、使用 asm 技术运行时动态生成字节码
 * 2、使用特定 classLoader 装载字节码
 * 3、利用反射拿到构造器生成代理对象
 */
public class CglibProxy {

    public static void main(String[] args) {
        // 动态生成代理类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(FooServiceImpl.class);
        enhancer.setCallback(new MyMethodInterceptor());
        FooService fooService =  (FooService) enhancer.create();

        // 调用方法
        fooService.sayHi();
    }
}

/**
 * 需要实现 MethodInterceptor，这个类与具体代理的目标类无关
 */
class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after method");
        return result;
    }
}