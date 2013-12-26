package com.earnbook.ebs.services.ejb.login;

import com.earnbook.ebs.client.delegate.service.LoginService;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;

public class LoginServiceImpl implements LoginService {

    @Override
    public UserDetails doLogin(UserDetails userDetails) {
        UserDetails userDetailsResult = null;
        if (userDetails != null) {
            userDetailsResult = new UserDetailsBuilder()
                    .setUserId(userDetails.getUserId()).setUserName(userDetails.getUserName())
                    .build();
        } else {
            new UserDetailsBuilder().build();
        }
        return userDetailsResult;
    }
}
