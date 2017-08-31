package com.sheng.controller;

import com.sheng.codetest.dao.OrderTestDOMapper;
import com.sheng.codetest.modal.entity.OrderTestDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shengxingyue on 2017/8/28.
 */
@Controller
public class Index {

    @Autowired
    private OrderTestDOMapper orderTestDOMapper;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        OrderTestDO orderTestDO = orderTestDOMapper.selectByPrimaryKey(1L);
        modelAndView.addObject(orderTestDO);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
