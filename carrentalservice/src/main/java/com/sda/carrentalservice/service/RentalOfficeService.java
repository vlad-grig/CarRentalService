package com.sda.carrentalservice.service;

import com.sda.carrentalservice.repository.RentalOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalOfficeService {

    private final RentalOfficeRepository rentalOfficeRepository;

    @Autowired
    public RentalOfficeService(RentalOfficeRepository rentalOfficeRepository) {
        this.rentalOfficeRepository = rentalOfficeRepository;
    }
}
