package com.earnbook.ebs.services.persistence.user;

import javax.persistence.*;

/**
 * Created by yash on 2/1/14.
 */
@Entity
@Table(name="business")
public class BusinessJpa {
    private long id;
    private String businessName;
    private BusinessCategoryJpa categoryJpa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @OneToMany(cascade= CascadeType.ALL)
    @JoinTable(name="business_cat_xref",
            joinColumns = {@JoinColumn(name="business_id", referencedColumnName="id")},
            inverseJoinColumns = {@JoinColumn(name="category_id", referencedColumnName="id")}
    )
    public BusinessCategoryJpa getCategoryJpa() {
        return categoryJpa;
    }

    public void setCategoryJpa(BusinessCategoryJpa categoryJpa) {
        this.categoryJpa = categoryJpa;
    }

}
