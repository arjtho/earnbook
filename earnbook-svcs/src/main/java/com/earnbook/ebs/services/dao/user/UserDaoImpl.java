package com.earnbook.ebs.services.dao.user;

import com.earnbook.ebs.client.exception.EbException;
import com.earnbook.ebs.client.model.domain.user.BusinessCategory;
import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.client.model.domain.user.UserSignUpDetails;
import com.earnbook.ebs.services.builder.user.UserDetailsBuilder;
import com.earnbook.ebs.services.persistence.user.BusinessCategoryJpa;
import com.earnbook.ebs.services.persistence.user.BusinessJpa;
import com.earnbook.ebs.services.persistence.user.UserJpa;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yash on 12/29/13.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserDetailsBuilder getUser(UserDetails user) throws EbException {
        System.out.println(">>>> getUser star >>>>>>t");
        Criteria loginCriteria = sessionFactory.getCurrentSession().createCriteria(UserJpa.class);
        loginCriteria.add(Restrictions.eq("email", user.getEmail()));
        UserJpa userJap= (UserJpa) loginCriteria.uniqueResult();
        if (userJap == null) {
            throw new EbException("User not found on DAO!!!");
        }
        return buildUserDetailsBuilder(userJap);
    }

    @Override
    public UserDetailsBuilder add(UserSignUpDetails userSignUpDetails) throws EbException{

        System.out.println(">>>> do add DAO impl start >>>>>>");
        UserJpa newUser = new UserJpa();
        newUser.setFirstName(userSignUpDetails.getUserDetails().getFirstName());
        newUser.setLastName(userSignUpDetails.getUserDetails().getLastName());
        newUser.setEmail(userSignUpDetails.getUserDetails().getEmail());
        newUser.setPassword(userSignUpDetails.getUserDetails().getPassword());

        BusinessJpa newBusinessJpa = new BusinessJpa();
        newBusinessJpa.setBusinessName(userSignUpDetails.getBusiness().getBusinessName());
      Set<BusinessCategoryJpa> businessCategoryJpaSet = new HashSet<BusinessCategoryJpa>();

        for (BusinessCategory cat : userSignUpDetails.getBusiness().getBusinessCategory())
        {
            BusinessCategoryJpa newBusinessCatJpa = new BusinessCategoryJpa();
            newBusinessCatJpa.setId(cat.getId());
            newBusinessCatJpa.setCategoryName(cat.getCategoryName());

            businessCategoryJpaSet.add(newBusinessCatJpa);
        }
        newBusinessJpa.setCategoryJpa(businessCategoryJpaSet);
        newUser.setUserBusiness(newBusinessJpa);
       Transaction transaction =  sessionFactory.getCurrentSession().beginTransaction();
        sessionFactory.getCurrentSession().save(newUser);
        transaction.commit();

        System.out.println(">>>> do add DAO impl end >>>>>>");
        return  getUser(userSignUpDetails.getUserDetails());
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
