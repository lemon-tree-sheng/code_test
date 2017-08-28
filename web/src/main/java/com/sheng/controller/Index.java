package com.sheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shengxingyue on 2017/8/28.
 */
@Controller
public class Index {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
