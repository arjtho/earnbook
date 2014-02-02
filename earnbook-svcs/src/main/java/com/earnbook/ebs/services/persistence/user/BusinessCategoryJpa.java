package com.earnbook.ebs.services.persistence.user;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yash on 2/1/14.
 */

@Entity
@Table(name="category")
public class BusinessCategoryJpa {
    private long id;
    private String categoryName;

    public BusinessCategoryJpa(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

  }
