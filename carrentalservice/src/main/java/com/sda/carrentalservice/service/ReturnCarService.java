package com.sda.carrentalservice.service;

import com.sda.carrentalservice.repository.ReturnCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnCarService {

    private final ReturnCarRepository returnCarRepository;

    @Autowired
    public ReturnCarService(ReturnCarRepository returnCarRepository) {
        this.returnCarRepository = returnCarRepository;
    }
}
