package com.earnbook.web.controller;

import com.earnbook.ebs.client.delegate.service.LoginService;
import com.earnbook.ebs.client.exception.EbException;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.client.model.domain.user.UserSignUpDetails;
import com.earnbook.web.helper.UserHelper;
import com.earnbook.web.modal.UserRequest;
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
    public UserDetails doLogin(ModelMap model, @RequestBody UserRequest userRequest) throws EbException {
        UserDetails userDetails = UserHelper.getUserDetails(userRequest);
        UserDetails userDetailsResult = loginService.doLogin(userDetails);
        return userDetailsResult;
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST, produces="application/json")
    @ResponseBody
    public UserDetails doSignUp(ModelMap model, @RequestBody UserRequest userRequest) throws EbException {
        UserDetails userDetailsResult = null;
       try {
           UserSignUpDetails userSignUpDetails = UserHelper.getUserSignUpDetails(userRequest);
            userDetailsResult = loginService.doSignUp(userSignUpDetails);

       }catch (Exception e) {
             System.out.println( e.getMessage());
       }
        return userDetailsResult;
    }

    @RequestMapping(value="/getLoginPage", method = RequestMethod.POST)
    public String getIndexPage(ModelMap mode) {
        return "login/login";
    }
}
