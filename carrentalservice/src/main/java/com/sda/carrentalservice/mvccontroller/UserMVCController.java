package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.dto.UserDTO;
import com.sda.carrentalservice.entity.User;
import com.sda.carrentalservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserMVCController {

    private final UserService userService;

    @Autowired
    public UserMVCController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/login")
    public String showLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("userRegister", new UserDTO());
        return "register";
    }

    @PostMapping("/user/register")
    public String registerUser(@ModelAttribute("userRegister") @Valid UserDTO userDTO, BindingResult result) {
        Optional<User> userOptional = userService.findUserByUsername(userDTO.getUsername());
        if (userOptional.isPresent()) {
            result.rejectValue("username", null, "Username already exists!");
        }
        if (!userDTO.getPassword().equals(userDTO.getConfirmPassword())) {
            result.rejectValue("password", null, "Passwords do not match!");
        }
        if (result.hasErrors()) {
            return "register";
        }
        userService.saveUserDTO(userDTO);
        return "login";
    }
}
