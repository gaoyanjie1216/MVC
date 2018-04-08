package com.gyj.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gao on 2018/3/14.
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/loginJsp")
    public String HelloWord() {

        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(String name, String pwd) {
        ModelAndView mv = new ModelAndView();
        System.out.println("进入了login()方法");
        System.out.println("name=" + name);
        System.out.println("pwd=" + pwd);
        mv.setViewName("/success");

        return mv;
    }
}

