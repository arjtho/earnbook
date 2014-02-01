package com.earnbook.web.modal;


import java.io.Serializable;
import java.util.Set;


public class UserRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String businessName;
    private Set businessCategory;

    public UserRequest() {
    }

    public UserRequest(long id, String email, String password, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public UserRequest(long id, String email, String password, String firstName, String lastName,
                       String businessName , Set businessCategory ) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.businessCategory = businessCategory;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Set getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(Set businessCategory) {
        this.businessCategory = businessCategory;
    }
}