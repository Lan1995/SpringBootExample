package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qing.lan
 * @date 2018/4/3 1:46
 * @Description test shiro
 */
@RequestMapping("shiro")
@Controller
public class HelloShiro {

    @RequestMapping("login")
    public ModelAndView login(ModelAndView model){
        System.out.printf("aaa");
        model.setViewName("login");
        return model;
    }
}
