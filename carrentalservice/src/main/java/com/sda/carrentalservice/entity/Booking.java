package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private LocalDate dateOfBooking;

    private String client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Car car;

    private LocalDate dateFrom;

    private LocalDate dateTo;

//    @ManyToOne
//    private RentalCar rental;

//    @ManyToOne
//    private ReturnCar returnCar;

    private Double amount;
}
