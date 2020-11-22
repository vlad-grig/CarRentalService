package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.repository.ReturnCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReturnCarMVCController {

    private final ReturnCarRepository returnCarRepository;

    @Autowired
    public ReturnCarMVCController(ReturnCarRepository returnCarRepository) {
        this.returnCarRepository = returnCarRepository;
    }
}
