package com.sda.carrentalservice.dto;

import javax.validation.constraints.NotBlank;

public class UserDTO extends BaseEntityDTO {

    private String username;

    private String password;

    private String confirmPassword;

    public UserDTO(Long id, String username, String password, String confirmPassword) {
        super(id);
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
