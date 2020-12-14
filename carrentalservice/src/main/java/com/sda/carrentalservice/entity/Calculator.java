package com.sda.carrentalservice.entity;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public void calculateAmountForBooking(Booking booking, Car carById) {
        long numberOfDaysForBooking = (booking.getDateTo().getTime() - booking.getDateFrom().getTime()) / (1000 * 60 * 60 * 24);
        booking.setAmount(carById.getAmount() * (double) numberOfDaysForBooking);
    }
}
