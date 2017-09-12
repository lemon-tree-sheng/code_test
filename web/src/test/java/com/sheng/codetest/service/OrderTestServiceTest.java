package com.sheng.codetest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shengxingyue on 2017/9/12.
 * spring-test 用于单元测试，因为要加载 spring 配置文件，所以测试用例要放在 web 项目中，再加上 @Runwith 和 @ContextConfiguration
 * 注解就可以了。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class OrderTestServiceTest {
    @Autowired
    private OrderTestService orderTestService;

    @Test
    public void testSpringTest() {
        orderTestService.springTest();
    }
}
