package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RentalMVCController {

    public final RentalService rentalService;

    @Autowired
    public RentalMVCController(RentalService rentalService) {
        this.rentalService = rentalService;
    }
}
