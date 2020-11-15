package com.sda.carrentalservice.restcontroller;

import com.sda.carrentalservice.service.BookingService;
import com.sda.carrentalservice.transformer.BookingTransfromer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/booking")
@CrossOrigin(origins = "*")
public class BookingController {

    private final BookingService bookingService;
    private final BookingTransfromer bookingTransfromer;

    @Autowired
    public BookingController(BookingService bookingService, BookingTransfromer bookingTransfromer) {
        this.bookingService = bookingService;
        this.bookingTransfromer = bookingTransfromer;
    }


}
