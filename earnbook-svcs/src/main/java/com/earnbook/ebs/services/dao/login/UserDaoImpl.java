package com.earnbook.ebs.services.dao.login;

import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;
import com.earnbook.ebs.services.persistence.user.UserJpa;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Created by yash on 12/29/13.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserDetailsBuilder getUser(UserDetails user) {
        Criteria loginCriteria = sessionFactory.getCurrentSession().createCriteria(UserJpa.class);
        loginCriteria.add(Restrictions.eq("email", user.getEmail())).add(Restrictions.eq("password", user.getPassword()));
        UserJpa userJap= (UserJpa) loginCriteria.uniqueResult();
        
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
