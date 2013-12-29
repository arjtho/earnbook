package com.earnbook.ebs.services.builder.user;

import com.earnbook.ebs.client.model.domain.user.UserDetails;
import com.earnbook.ebs.services.builder.Builder;
import com.earnbook.ebs.services.persistence.user.UserJpa;

public class UserDetailsBuilder implements Builder<UserDetails> {
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public UserDetailsBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public UserDetailsBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserDetailsBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDetailsBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserDetailsBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserDetails createUserDetails() {
        return new UserDetails(id, email, password, firstName, lastName);
    }
    /**
     * Build modal object.
     * @return
     */
    @Override
    public UserDetails build() {
        return new UserDetails(id, email, password, firstName, lastName);
    }

}