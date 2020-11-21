package com.sda.carrentalservice.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingMVCController {

    @GetMapping("/add-booking")
    public String addBooking(){
        return "add-booking";
    }
}
