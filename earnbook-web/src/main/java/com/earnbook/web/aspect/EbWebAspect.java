package com.earnbook.web.aspect;

import com.earnbook.ebs.client.exception.EbException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by yash on 1/4/14.
 */
@Aspect
public class EbWebAspect {

    @Before(value="(execution(* com.earnbook.ebs.client.delegate.service.*.*(..)))")
    public void preProcessValidation(JoinPoint joinPoint) {
        System.out.print("preProcessValidation in @Before EbWebAspect");

    }

    @AfterThrowing(value="(execution(* com.earnbook.web.controller.*.*(..)))", throwing ="result", argNames = "")
      public String callOnThrowException(JoinPoint joinPoint, EbException result) throws EbException{
        System.out.println(">>>>>>>>>> In callOnThrowException >>>>>>>>>>>>>>>>");

        return "user does not exist on Web AOP";

    }



}
