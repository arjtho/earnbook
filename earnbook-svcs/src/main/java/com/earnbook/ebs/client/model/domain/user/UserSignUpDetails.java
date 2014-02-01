package com.earnbook.ebs.client.model.domain.user;


import java.io.Serializable;


public class UserSignUpDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    UserDetails  userDetails;
    String businessName;
    String businessCategory;

    public UserSignUpDetails() {

    }

    public UserSignUpDetails(UserDetails theUserDetails, String theBusinessName, String theBusinessCategory) {
        this.userDetails = theUserDetails;
        this.businessName = theBusinessName;
        this.businessCategory = theBusinessCategory;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }
}