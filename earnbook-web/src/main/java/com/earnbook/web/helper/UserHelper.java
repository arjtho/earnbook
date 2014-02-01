package com.earnbook.web.helper;

import com.earnbook.ebs.client.model.domain.user.Business;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.client.model.domain.user.UserSignUpDetails;
import com.earnbook.web.modal.UserRequest;

/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 1/30/14
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserHelper {

    public static UserSignUpDetails getUserSignUpDetails(UserRequest userRequest) {
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(userRequest.getFirstName());
        userDetails.setEmail(userRequest.getEmail());
        userDetails.setPassword(userRequest.getPassword());
        userDetails.setLastName(userRequest.getLastName());
        Business business = new Business();
        business.setBusinessCategory(userRequest.getBusinessCategory());
        business.setBusinessName(userRequest.getBusinessName());
        UserSignUpDetails userSignUpDetails= new UserSignUpDetails(userDetails, business);
        return userSignUpDetails;
    }

    public static UserDetails getUserDetails(UserRequest userRequest) {
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(userRequest.getFirstName());
        userDetails.setEmail(userRequest.getEmail());
        userDetails.setPassword(userRequest.getPassword());
        userDetails.setLastName(userRequest.getLastName());
        return userDetails;
    }
}
