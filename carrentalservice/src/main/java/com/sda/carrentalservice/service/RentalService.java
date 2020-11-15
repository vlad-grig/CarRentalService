package com.sda.carrentalservice.service;

import com.sda.carrentalservice.entity.Rental;
import com.sda.carrentalservice.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {

    private final RentalRepository rentalRepository;

    @Autowired
    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public Rental saveRental(Rental rental){
        return rentalRepository.save(rental);
    }

    public List<Rental> findAllRentals() { return rentalRepository.findAll(); }

    public void deleteAllRentals() { rentalRepository.deleteAll(); }
}
