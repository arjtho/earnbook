package com.earnbook.web.advice;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yash on 1/5/14.
 */
@ControllerAdvice
public class EbExceptionAdvice {
    private static final Logger logger = Logger.getLogger(EbExceptionAdvice.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ModelAndView exception(Exception e, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("login/login");
        mav.addObject("name", e.getClass().getSimpleName());
        mav.addObject("message", e.getMessage());
        mav.addObject("status", 500);
        logger.info(">>>>>>>>>>>>>Logging framework>>>>>>>>>In EbExceptionAdvice " + request.getHeader("X-Requested-With"));
        return mav;
    }
}
