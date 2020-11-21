package com.sda.carrentalservice.dto;

import javax.validation.constraints.NotBlank;

public class UserDTO extends BaseEntityDTO {

    @NotBlank(message = "Username cannot be empty!")
    private String username;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    @NotBlank(message = "User type cannot be empty!")
    private String userType;

    public UserDTO(Long id, String username, String password, String userType) {
        super(id);
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public UserDTO() {
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
