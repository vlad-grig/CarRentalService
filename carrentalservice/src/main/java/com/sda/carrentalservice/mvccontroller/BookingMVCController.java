package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BookingMVCController {

    private final BookingService bookingService;

    @Autowired
    public BookingMVCController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @GetMapping(path = "bookings")
    public String showBooking(Model model) {
        List<Booking> bookingList = this.bookingService.findAllBooking();
        model.addAttribute("bookings", bookingList);
        return "booking-list";
    }
}
