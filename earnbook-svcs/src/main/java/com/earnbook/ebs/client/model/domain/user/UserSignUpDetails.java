package com.earnbook.ebs.client.model.domain.user;


import java.io.Serializable;


public class UserSignUpDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    UserDetails  userDetails;
    Business business;
    public UserSignUpDetails() {

    }

    public UserSignUpDetails(UserDetails theUserDetails, Business business) {
        this.userDetails = theUserDetails;
        this.business = business;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}