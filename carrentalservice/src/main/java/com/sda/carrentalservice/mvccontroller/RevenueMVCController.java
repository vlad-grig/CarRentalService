package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.RevenueService;
import org.springframework.stereotype.Controller;

@Controller
public class RevenueMVCController {
    private final RevenueService revenueService;

    public RevenueMVCController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }
}
