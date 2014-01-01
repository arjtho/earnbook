package com.earnbook.ebs.services.dao.user;

import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;

/**
 * Created by yash on 12/29/13.
 */
public interface UserDao {
    public UserDetailsBuilder getUser(UserDetails user);
    public void add(UserDetails user);
    public void delete(UserDetails user);
}
