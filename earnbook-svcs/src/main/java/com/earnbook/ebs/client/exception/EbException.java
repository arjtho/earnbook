package com.earnbook.ebs.client.exception;

/**
 * Created by yash on 1/7/14.
 */
public class EbException extends Exception {

    private String exceptionMsg;

    public EbException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg(){
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
