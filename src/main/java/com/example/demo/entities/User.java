package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    
    @OneToMany(mappedBy = "user")
    List<UserRoleRegion> userRoleRegions;

    public User(){}

    public User(String username, String password, List<UserRoleRegion> userRoleRegions) {
        this.username = username;
        this.password = password;
        this.userRoleRegions = userRoleRegions;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public List<UserRoleRegion> getUserRoleRegions() {
        return userRoleRegions;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserRoleRegions(List<UserRoleRegion> userRoleRegions) {
        this.userRoleRegions = userRoleRegions;
    }
}
