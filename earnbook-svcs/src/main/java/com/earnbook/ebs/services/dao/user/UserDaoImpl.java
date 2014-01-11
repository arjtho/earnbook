package com.earnbook.ebs.services.dao.user;

import com.earnbook.ebs.client.exception.EbException;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;
import com.earnbook.ebs.services.persistence.user.UserJpa;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Created by yash on 12/29/13.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserDetailsBuilder getUser(UserDetails user) throws EbException {
        Criteria loginCriteria = sessionFactory.getCurrentSession().createCriteria(UserJpa.class);
        loginCriteria.add(Restrictions.eq("email", user.getEmail()));
        UserJpa userJap= (UserJpa) loginCriteria.uniqueResult();
        if (userJap == null) {
            throw new EbException("User not found on DAO!!!");
        }
        return buildUserDetailsBuilder(userJap);
    }

    @Override
    public void add(UserDetails user) {





    }

    @Override
    public void delete(UserDetails user) {

    }
    
    private UserDetailsBuilder buildUserDetailsBuilder(UserJpa userJap)
    {
        UserDetailsBuilder userDetailsBuilder = new UserDetailsBuilder()
                .setEmail(userJap.getEmail())
                .setFirstName(userJap.getFirstName())
                .setLastName(userJap.getLastName());
        return userDetailsBuilder;
    }
}
