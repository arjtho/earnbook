package com.earnbook.ebs.services.builder;

/**
 * Base builder pattern.
 * Created with IntelliJ IDEA.
 * UserJpa: Mahadev
 * Date: 11/14/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Builder<T> {

    /**
     * Build modal object.
     * @return
     */
    public T build();
}
