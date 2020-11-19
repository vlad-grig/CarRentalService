package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeMVCController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeMVCController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String showEmployees(Model model) {
        model.addAttribute("employees", this.employeeService.findAllEmployees());
        return "index";
    }
}
