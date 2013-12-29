package com.earnbook.web.controller;

import com.earnbook.ebs.client.delegate.service.LoginService;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class LoginController {

    @Resource(name = "loginService")
    LoginService loginService;

    @Autowired
    public void setUserService(LoginService userService) {
        this.loginService =    userService;
    }

    @RequestMapping(value="/login", method = RequestMethod.POST, produces="application/json")
    @ResponseBody
    public UserDetails doLogin(ModelMap model, @RequestBody UserDetails userDetails) {
        UserDetails userDetailsResult = loginService.doLogin(userDetails);
        return userDetailsResult;
    }
}
