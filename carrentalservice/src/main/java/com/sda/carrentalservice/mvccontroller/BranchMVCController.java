package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BranchMVCController {

    private final BranchService branchService;

    @Autowired
    public BranchMVCController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping(path = "/branches")
    public String showBranches(Model model) {
        List<Branch> allBranches = this.branchService.findAllBranches();
        model.addAttribute("branches", allBranches);
        return "index";
    }

    @GetMapping(path = "/branch/delete/{id}")
    public String deleteBranchById(@PathVariable("id") Long id) {
        branchService.deleteBranchById(id);
        return "redirect:/";
    }

    @PostMapping(path = "/branch/add")
    public String addBranch(@ModelAttribute("branch") @Valid Branch branch, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-branch";
        } else {
            this.branchService.saveBranch(branch);
            return "redirect:/";
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
            return "redirect:/";
        }
    }

    @GetMapping(path = "/branch/edit/{id}")
    public String showUpdatePage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("branch", this.branchService.findBranchById(id));
        return "edit-branch";
    }
}
