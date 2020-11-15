package com.sda.carrentalservice.restcontroller;

import com.sda.carrentalservice.service.RentalOfficeService;
import com.sda.carrentalservice.transformer.RentalOfficeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/rentaloffice")
public class RentalOfficeController {

    private final RentalOfficeService rentalOfficeService;
    private final RentalOfficeTransformer rentalOfficeTransformer;

    @Autowired
    public RentalOfficeController(RentalOfficeService rentalOfficeService, RentalOfficeTransformer rentalOfficeTransformer) {
        this.rentalOfficeService = rentalOfficeService;
        this.rentalOfficeTransformer = rentalOfficeTransformer;
    }

    
}
