package com.earnbook.ebs.aspect;

import com.earnbook.ebs.client.exception.EbException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by yash on 1/4/14.
 */
@Aspect
public class EbServiceAspect {

    @AfterThrowing(value="execution(* com.earnbook.ebs.client.delegate.service.*.*(..)))", throwing="exception")
    public void callOnThrowException(JoinPoint joinPoint, EbException exception) throws EbException{
        System.out.print(">>>>>>>>>> SERVICE >>>>: In callOnThrowException >>>>>>>>>>>>>>>>");
        throw new EbException("user not found from service AOP");
    }
}
