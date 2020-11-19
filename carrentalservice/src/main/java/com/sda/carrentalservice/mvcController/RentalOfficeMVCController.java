package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.RentalOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RentalOfficeMVCController {

    private final RentalOfficeService rentalOfficeService;

    @Autowired
    public RentalOfficeMVCController(RentalOfficeService rentalOfficeService) {
        this.rentalOfficeService = rentalOfficeService;
    }
}
