package com.earnbook.ebs.client.delegate.service;


import com.earnbook.ebs.client.exception.EbException;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.client.model.domain.user.UserSignUpDetails;

import javax.ejb.Remote;


@Remote
public interface LoginService {

   public UserDetails doLogin(UserDetails userDetails) throws EbException;
   public UserDetails doSignUp(UserSignUpDetails userSignUpDetails) throws EbException;

}
