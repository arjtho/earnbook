package com.earnbook.ebs.client.model.domain.user;
import java.io.Serializable;

public class UserDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    private String userName;
    private String password;

    public UserDetails() {
    }

    public UserDetails(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}