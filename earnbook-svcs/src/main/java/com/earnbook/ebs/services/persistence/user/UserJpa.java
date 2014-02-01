package com.earnbook.ebs.services.persistence.user;




import com.earnbook.ebs.client.model.domain.user.Business;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class UserJpa implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private BusinessJpa userBusiness;

    public UserJpa() {
    }

    public UserJpa(long id, String email, String password, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name ="first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name ="last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name ="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name ="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="user_business_xref",
            joinColumns = {@JoinColumn(name="business_id", referencedColumnName="id")},
            inverseJoinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")}
    )
    public BusinessJpa getUserBusiness() {
        return userBusiness;
    }

    public void setUserBusiness(BusinessJpa userBusiness) {
        this.userBusiness = userBusiness;
    }
}