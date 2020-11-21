package com.sda.carrentalservice.restcontroller;

import com.sda.carrentalservice.service.RevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/revenue")
public class RevenueRestController {
    public final RevenueService revenueService;

    @Autowired
    public RevenueRestController(RevenueService revenueService){
        this.revenueService = revenueService;
    }
}
