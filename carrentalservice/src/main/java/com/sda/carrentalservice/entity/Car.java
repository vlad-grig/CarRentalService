package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    private String make;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String color;
    private int mileage;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Double amount;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Booking> bookingList = new ArrayList<>();
}
