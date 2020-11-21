package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.entity.Customer;
import com.sda.carrentalservice.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerMVCController {

    private final CustomerService customerService;

    public CustomerMVCController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = "/customer/add")
    public String addCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "add-customer";
        }else {
            this.customerService.saveCustomer(customer);
            return "redirect:/";
        }
    }
}
