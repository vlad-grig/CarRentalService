package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateOfBooking;
    private String client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Car car;

    private LocalDate dateFrom;
    private LocalDate dateTo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Rental rental;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private ReturnCar returnCar;

    private Double amount;
}
