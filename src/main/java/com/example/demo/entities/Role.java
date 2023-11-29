package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role")
    List<UserRoleRegion> userRoleRegions;

    public Role(){}
    public Role(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<UserRoleRegion> getUserRoleRegions() {
        return userRoleRegions;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUserRoleRegions(List<UserRoleRegion> userRoleRegions) {
        this.userRoleRegions = userRoleRegions;
    }
}
