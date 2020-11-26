package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.service.BranchService;
import com.sda.carrentalservice.service.CarService;
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
import javax.websocket.server.PathParam;

@Controller
public class BranchMVCController {

    private final BranchService branchService;
    private final CarService carService;
    private final EmployeeService employeeService;

    @Autowired
    public BranchMVCController(BranchService branchService, CarService carService, EmployeeService employeeService) {
        this.branchService = branchService;
        this.carService = carService;
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/branches")
    public String showBranches(Model model) {
        model.addAttribute("branches", this.branchService.findAllBranches());
        model.addAttribute("branchesNumber", this.branchService.countBranches());
        model.addAttribute("cars", this.carService.findAllCars());
        model.addAttribute("carsNumber", this.carService.countCars());
        model.addAttribute("employees", this.employeeService.findAllEmployees());
        model.addAttribute("employeesNumber", this.employeeService.countEmployees());
        return "branch-list";
    }

    @GetMapping(path = "/branch/id")
    public String showBranchById(Model model) {
        model.addAttribute("allBranches", this.branchService.findAllBranches());
        model.addAttribute("numberOfBranches", this.branchService.countBranches());
        model.addAttribute("cars", this.carService.findAllCars());
        model.addAttribute("carsNumber", this.carService.countCars());
        model.addAttribute("employees", this.employeeService.findAllEmployees());
        model.addAttribute("employeesNumber", this.employeeService.countEmployees());
        return "branch-id-list";
    }

    @GetMapping(path = "/branch/delete/{id}")
    public String deleteBranchById(@PathVariable("id") Long id) {
        branchService.deleteBranchById(id);
        return "redirect:/branches";
    }

    @PostMapping(path = "/branch/add")
    public String addBranch(@ModelAttribute("branch") @Valid Branch branch, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-branch";
        } else {
            this.branchService.saveBranch(branch);
            return "redirect:/branches";
        }
    }

    @GetMapping(path = "/branch/registration")
    public String showRegistrationPage(Model model) {
        model.addAttribute("branch", new Branch());
        return "add-branch";
    }

    @PostMapping(path = "/branch/update")
    public String editBranch(@ModelAttribute("branch") @Valid Branch branch, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-branch";
        } else {
            this.branchService.saveBranch(branch);
            return "redirect:/branches";
        }
    }

    @GetMapping(path = "/branch/edit/{id}")
    public String showUpdatePage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("branch", this.branchService.findBranchById(id));
        return "edit-branch";
    }
}
