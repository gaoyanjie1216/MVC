package com.gyj.mvc.controller;

import com.gyj.mvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gao on 2018/4/6.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/trans")
    public void trans() {

        accountService.transfer("aaa", "bbb", 200d);
    }
}
