package com.sda.carrentalservice.restcontroller;

import com.sda.carrentalservice.service.EmployeeService;
import com.sda.carrentalservice.transformer.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeTransformer employeeTransformer;

    @Autowired
    public EmployeeController(EmployeeService employeeService, EmployeeTransformer employeeTransformer) {
        this.employeeService = employeeService;
        this.employeeTransformer = employeeTransformer;
    }

    
}
