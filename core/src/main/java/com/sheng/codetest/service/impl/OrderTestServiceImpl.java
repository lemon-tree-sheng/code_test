package com.sheng.codetest.service.impl;

import com.sheng.codetest.dao.OrderTestDOMapper;
import com.sheng.codetest.dao.OrderUserTestDOMapper;
import com.sheng.codetest.modal.entity.OrderTestDO;
import com.sheng.codetest.modal.entity.OrderUserTestDO;
import com.sheng.codetest.service.OrderTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * Created by shengxingyue on 2017/9/1.
 */
@Service
public class OrderTestServiceImpl implements OrderTestService {

    @Autowired
    private OrderTestDOMapper orderTestDOMapper;

    @Autowired
    private OrderUserTestDOMapper orderUserTestDOMapper;

    /**
     * 在这里对事务进行了测试，在配置文件中配置好事务处理之后，在这里使用注解标注就可以
     * spring 默认事务回滚是当代码中抛出运行时异常，那么这个事务会被回滚。
     * 如果抛出的异常被 catch，catch 之后不抛异常，那么不会回滚，catch 后仍然需要回滚，则需要手动抛异常（很容易理解，catch 住之后就表示你已经处理了，spring 自己去回滚不合逻辑，
     * 如果你只是在 catch 中想打一下日志，做一下灾后处理，需要之前的操作被回滚，那么可以手动回滚，或者抛 runtimeException
     * ps: 手动回滚相当于 catch 住异常，代码依旧往后走，只是对数据库所有的操作，在方法执行完之后回滚。
     */
    @Transactional
    public void testTransactional(OrderTestDO orderTest) {
        try {
            OrderTestDO orderTestDO = new OrderTestDO();
            orderTestDO.setId(8L);
            orderTestDO.setCarId("78642");
            orderTestDO.setModelCode("7896-y");
            orderTestDOMapper.insert(orderTestDO);

            ////////////////test code////////////////////////////
            if (1 == 2) {
                throw new RuntimeException("运行时异常");
            }

            try {
                int a = 1 / 0;
            } catch (RuntimeException e) {
                System.out.println("异常处理");
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); // 手动回滚
            }

            {
                System.out.println("手动回滚之后，后面还会不会执行呢？");
                orderTest.setModelCode("xiaohong");
            }
            ////////////////test code/////////////////////////////


            OrderUserTestDO orderUserTestDO = new OrderUserTestDO();
            orderUserTestDO.setId(8L);
            orderUserTestDO.setOrderTestId("5");
            orderUserTestDO.setUserName("xiaoming");
            orderUserTestDOMapper.insert(orderUserTestDO);
        } finally {
            System.out.println("hello");
        }
    }
}
