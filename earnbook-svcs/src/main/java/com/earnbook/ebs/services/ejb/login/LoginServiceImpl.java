package com.earnbook.ebs.services.ejb.login;

import com.earnbook.ebs.client.delegate.service.LoginService;
import com.earnbook.ebs.client.exception.EbException;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;
import com.earnbook.ebs.services.dao.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails doLogin(UserDetails userDetails)throws EbException {
        UserDetailsBuilder userDetailsResult = userDao.getUser(userDetails);

        return userDetailsResult.build();
    }
}
