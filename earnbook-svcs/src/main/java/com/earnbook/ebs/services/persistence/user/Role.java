package com.earnbook.ebs.services.persistence.user;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by yash on 1/19/14.
 */
@Entity
@Table(name="roles")
public class Role {
        @Id
        @GeneratedValue
        private Integer id;

        private String role;

        @OneToMany(cascade=CascadeType.ALL)
        @JoinTable(name="user_roles",
                joinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")},
                inverseJoinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")}
        )
        private Set<UserJpa> userRoles;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Set<UserJpa> getUserRoles() {
            return userRoles;
        }

        public void setUserRoles(Set<UserJpa> userRoles) {
            this.userRoles = userRoles;
        }


}
