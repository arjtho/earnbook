package com.earnbook.ebs.client.model.domain.user;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 2/1/14
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Business {
    private long id;
    private String businessName;
    private Set<BusinessCategory> businessCategory;

    public Business() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Set<BusinessCategory> getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(Set<BusinessCategory> businessCategory) {
        this.businessCategory = businessCategory;
    }
}
