package com.sda.carrentalservice.service;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
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
            Booking booking = optionalBooking.get();
            return booking;
        }else {
            throw new RuntimeException();
        }
    }

    public void deleteById(Long id){
        this.findBookingById(id);
        bookingRepository.deleteById(id);
    }
}
