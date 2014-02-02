package com.earnbook.ebs.services.dao.user;

import com.earnbook.ebs.client.exception.EbException;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.client.model.domain.user.UserSignUpDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;

/**
 * Created by yash on 12/29/13.
 */
public interface UserDao {
    public UserDetailsBuilder getUser(UserDetails user) throws EbException;
    public UserDetailsBuilder add(UserSignUpDetails userSignUpDetails) throws EbException;
    public void delete(UserDetails user);
}
