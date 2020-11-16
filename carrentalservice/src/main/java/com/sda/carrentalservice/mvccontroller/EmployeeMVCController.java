package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Employee;
import com.sda.carrentalservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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

    @GetMapping(path = "/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }

    @PostMapping(path = "/employee/add")
    public String addEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-employee";
        } else {
            this.employeeService.saveEmployee(employee);
            return "redirect:/";
        }
    }

    @PostMapping(path = "/employee/update")
    public String editEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-employee";
        } else {
            this.employeeService.saveEmployee(employee);
            return "redirect:/";
        }
    }
}
