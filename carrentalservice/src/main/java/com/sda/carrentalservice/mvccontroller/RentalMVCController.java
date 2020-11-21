package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.RentalService;
import org.springframework.stereotype.Controller;

@Controller
public class RentalMVCController {
    public final RentalService rentalService;

    public RentalMVCController(RentalService rentalService) {
        this.rentalService = rentalService;
    }
}
