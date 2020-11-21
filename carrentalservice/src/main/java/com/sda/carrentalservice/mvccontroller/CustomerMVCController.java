package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Customer;
import com.sda.carrentalservice.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerMVCController {

    private final CustomerService customerService;

    public CustomerMVCController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/customers")
    public String showCustomers(Model model){
        model.addAttribute("customers", this.customerService.findAllCustomer());
        return "index";
    }

    @PostMapping(path = "/viewAddCustomer")
    public String viewAddCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "add-customer";
    }


    @PostMapping(path = "/customer/add")
    public String addCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-customer";
        } else {
            this.customerService.saveCustomer(customer);
            return "redirect:/";
        }
    }

    @PostMapping(path = "/customer/update")
    public String editCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "edit-customer";
        }
        this.customerService.saveCustomer(customer);
        return "redirect:/";
    }
}
