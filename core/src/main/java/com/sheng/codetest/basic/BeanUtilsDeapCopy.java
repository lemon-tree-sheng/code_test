package com.sheng.codetest.basic;

import com.sheng.codetest.modal.entity.OrderTestDO;
import com.sheng.codetest.modal.entity.OrderUserTestDO;
import com.sheng.codetest.modal.mapper.OrderTestDOMapper;
import com.sheng.codetest.modal.vo.OrderTestVO;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shengxingyue on 2017/9/13.
 * spring提供的属性复制工具类测试。基本功能：复制一个 bean 的属性到另一个 bean，通常用于 bean 转换。不严格需要字段一一对应，相同即复制，不同默认忽略掉。同时提供有几个重载方法，
 * 可以指定字段复制，忽略某些字段，在字段非常多的时候可以使用。
 * 不足：不支持属性名不同互相拷贝,可以参考使用 mapstruct 解决这个问题
 */
public class BeanUtilsDeapCopy {

//    @Test
    public void testBeanUtils() {
        OrderTestDO orderTestDO = new OrderTestDO();
        orderTestDO.setId(123L);
        orderTestDO.setCarId("hjxolj");
        orderTestDO.setModelCode("mmhjoiuj-a");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("aaa", "bbb");
        map.put("bbb", new OrderUserTestDO());
        orderTestDO.setData(map);
        OrderUserTestDO orderUserTestDO = new OrderUserTestDO();
        orderUserTestDO.setUserName("xiaoming");
        orderTestDO.setOrderUserTestDO(orderUserTestDO);

        OrderTestVO orderTestVO = new OrderTestVO();
        BeanUtils.copyProperties(orderTestDO, orderTestVO);

        System.out.println(orderTestVO);
    }

    @Test
    public void testMapStruct() {
        OrderTestDO orderTestDO = new OrderTestDO();
        orderTestDO.setId(123L);
        orderTestDO.setCarId("hjxolj");
        orderTestDO.setModelCode("mmhjoiuj-a");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("aaa", "bbb");
        map.put("bbb", new OrderUserTestDO());
        orderTestDO.setData(map);
        OrderUserTestDO orderUserTestDO = new OrderUserTestDO();
        orderUserTestDO.setUserName("xiaoming");
        orderTestDO.setOrderUserTestDO(orderUserTestDO);

        OrderTestVO orderTestVO = OrderTestDOMapper.INSTANCE.orderTestDOToOrderTestVO(orderTestDO);
        System.out.println(orderTestVO);
    }
}
