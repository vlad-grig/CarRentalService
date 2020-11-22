package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.RevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevenueMVCController {

    private final RevenueService revenueService;

    @Autowired
    public RevenueMVCController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    @GetMapping(path = "/revenue")
    public String showRevenues(Model model) {
        model.addAttribute("revenue", this.revenueService.findAllRevenues());
        return "revenue-list";
    }
}
