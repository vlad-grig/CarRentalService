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
    // car
    private LocalDate dateFrom;
    private LocalDate dateTo;
    // rental branch
    // return branch
    private Double amount;
}
