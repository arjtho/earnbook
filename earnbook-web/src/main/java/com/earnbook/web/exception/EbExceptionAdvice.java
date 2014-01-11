package com.earnbook.web.exception;

import com.earnbook.ebs.client.exception.EbException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import javax.servlet.http.*;

import java.util.Date;

/**
 * Created by yash on 1/5/14.
 */
@ControllerAdvice
public class EbExceptionAdvice {

    @ExceptionHandler(EbException.class)
    @ResponseBody
    public ModelAndView exception(EbException e, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("name", e.getClass().getSimpleName());
        mav.addObject("message", e.getMessage());
        mav.addObject("status", 500);

        System.out.println(request.getHeader("X-Requested-With"));
        return mav;
    }
}
