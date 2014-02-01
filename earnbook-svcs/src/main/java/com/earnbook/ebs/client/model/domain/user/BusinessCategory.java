package com.earnbook.ebs.client.model.domain.user;

/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 2/1/14
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class BusinessCategory {
    private long id;
    private String categoryName;

    public BusinessCategory() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
