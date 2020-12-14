package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.entity.Customer;
import com.sda.carrentalservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BookingMVCController {

    private final BookingService bookingService;
    private final BranchService branchService;
    private final CarService carService;
    private final CustomerService customerService;
    private final EmployeeService employeeService;
    private final UserService userService;

    @Autowired
    public BookingMVCController(BookingService bookingService, BranchService branchService, CarService carService, EmployeeService employeeService, CustomerService customerService, UserService userService) {
        this.bookingService = bookingService;
        this.branchService = branchService;
        this.carService = carService;
        this.customerService = customerService;
        this.employeeService = employeeService;
        this.userService = userService;
    }

    @GetMapping(path = "/bookings")
    public String showBooking(Model model) {
        model.addAttribute("bookings", this.bookingService.findAllBookings());
        model.addAttribute("bookingsNumber", this.bookingService.countBookings());
        return "booking-list";
    }

    @GetMapping(path = "/booking/registration")
    public String showRegistration(Model model) {
        model.addAttribute("booking", new Booking());
        model.addAttribute("allBranches", this.branchService.findAllBranches());
        model.addAttribute("allCars", this.carService.findAllCars());
        model.addAttribute("employees", this.employeeService.findAllEmployees());
        return "add-booking";
    }

    @PostMapping(path = "/booking/add")
    public String addBooking(@ModelAttribute("booking") @Valid Booking booking, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-booking";
        } else {
            String name = SecurityContextHolder.getContext().getAuthentication().getName();
            Customer customer = customerService.findCustomerByUsername(name);
            booking.setCustomer(customer);
            Car carById = carService.findCarById(booking.getCar().getId());
            booking.setCar(carById);
            calculateAmountForCurentBooking(booking, carById);
            this.bookingService.saveBooking(booking);
            return "redirect:/";
        }
    }

    private void calculateAmountForCurentBooking(Booking booking, Car carById) {
        long numberOfDaysForBooking = (booking.getDateTo().getTime() - booking.getDateFrom().getTime()) / (1000 * 60 * 60 * 24);
        booking.setAmount(carById.getAmount() * (double) numberOfDaysForBooking);
    }

    @GetMapping(path = "/booking/delete/{id}")
    public String deleteBookingById(@PathVariable("id") Long id) {
        this.bookingService.deleteBookingById(id);
        return "redirect:/bookings";
    }

    @PostMapping(path = "/booking/update")
    public String editBooking(@ModelAttribute("booking") @Valid Booking booking, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-booking";
        }
        this.bookingService.saveBooking(booking);
        return "redirect:/bookings";
    }

    @GetMapping(path = "/booking/edit/{id}")
    public String showEditPageBooking(@PathVariable("id") Long id, Model model) {
        model.addAttribute("booking", this.bookingService.findBookingById(id));
        model.addAttribute("branches", this.branchService.findAllBranches());
        model.addAttribute("cars", this.carService.findAllCars());
        model.addAttribute("employees", this.employeeService.findAllEmployees());
        return "edit-booking";
    }
}
