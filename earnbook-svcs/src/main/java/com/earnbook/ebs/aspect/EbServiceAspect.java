package com.earnbook.ebs.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by yash on 1/4/14.
 */
@Aspect
public class EbServiceAspect {

    @AfterThrowing(value="execution(* com.earnbook.ebs.client.delegate.service.*.*(..)))", throwing="exception")
    public void callOnThrowException(JoinPoint joinPoint, Exception exception) throws Exception{
        System.out.print(">>>>>>>>>> SERVICE >>>>: In callOnThrowException >>>>>>>>>>>>>>>>");
        throw new Exception("user not found from service AOP");
    }
}
