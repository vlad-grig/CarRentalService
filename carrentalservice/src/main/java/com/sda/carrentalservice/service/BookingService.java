package com.sda.carrentalservice.service;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.entity.Customer;
import com.sda.carrentalservice.exception.NotFoundException;
import com.sda.carrentalservice.repository.BookingRepository;
import com.sda.carrentalservice.repository.CarRepository;
import com.sda.carrentalservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final CarRepository carRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository, CarRepository carRepository, CustomerRepository customerRepository) {
        this.bookingRepository = bookingRepository;
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> findAllBooking() {
        return bookingRepository.findAll();
    }

    public Booking findBookingById(Long id){
        Optional<Booking> optionalBooking = bookingRepository.findById(id);
        if (optionalBooking.isPresent()){
            return optionalBooking.get();
        }else {
            throw new NotFoundException("Booking with id " + id + " does not exist.");
        }
    }

    public void deleteBookingById(Long id){
        Booking bookingById = this.findBookingById(id);
        Car car = bookingById.getCar();
        car.getBookingList().remove(bookingById);
        carRepository.save(car);
        Customer customer = bookingById.getCustomer();
        customer.getBookingList().remove(bookingById);
        customerRepository.save(customer);
        bookingRepository.deleteById(id);
    }

    public Long countBookings() {
        return bookingRepository.count();
    }
}
