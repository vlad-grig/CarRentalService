package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserMVCController {

    private final UserService userService;

    @Autowired
    public UserMVCController(UserService userService) {
        this.userService = userService;
    }
}
