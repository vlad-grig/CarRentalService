package com.sda.carrentalservice.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class User extends BaseEntity {

    @NotBlank(message = "Username cannot be empty!")
    @Column(nullable = false)
    private String username;

    @NotBlank(message = "Password cannot be empty")
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "User type cannot be empty!")
    @Column(nullable = false)
    private String userType;

    public User(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
