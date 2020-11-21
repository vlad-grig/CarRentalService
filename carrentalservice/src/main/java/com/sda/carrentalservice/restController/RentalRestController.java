package com.sda.carrentalservice.restController;

import com.sda.carrentalservice.service.RentalService;
import com.sda.carrentalservice.transformer.RentalTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/rental")
public class RentalRestController {
    private final RentalService rentalService;
    private final RentalTransformer rentalTransformer;

    @Autowired
    public RentalRestController(RentalService rentalService, RentalTransformer rentalTransformer) {
        this.rentalService = rentalService;
        this.rentalTransformer = rentalTransformer;
    }
}
