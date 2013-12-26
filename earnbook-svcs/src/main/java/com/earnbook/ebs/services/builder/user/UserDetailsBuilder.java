package com.earnbook.ebs.services.builder.user;

import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.Builder;

public class UserDetailsBuilder implements Builder<UserDetails> {

    private String userId;
    private String userName;
    private String password;

    public UserDetailsBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public UserDetailsBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserDetailsBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDetails createUserDetails(final String userId, final String userName, final String password) {
        return new UserDetails(userId, userName, password);
    }

    /**
     * Build modal object.
     * @return
     */
    @Override
    public UserDetails build() {
        return new UserDetails(userId, userName, password);
    }
}