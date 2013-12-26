package com.earnbook.ebs.services.assempler;

import java.util.List;

/**
 * Base builder pattern.
 * Created with IntelliJ IDEA.
 * UserJpa: Mahadev
 * Date: 11/14/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Assembler<T> {

    /**
     * Assemble the modal object from jpa.
     * @return
     */
    public List<T> assemble();
}
