package com.sda.carrentalservice.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class User extends BaseEntity {

    @NotBlank(message = "Username cannot be empty!")
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "Password cannot be empty")
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "User type cannot be empty!")
    @Column(nullable = false)
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String userType) {
        this.role = userType;
    }
}
