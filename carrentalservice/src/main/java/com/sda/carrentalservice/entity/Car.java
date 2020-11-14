package com.sda.carrentalservice.entity;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private String bodyType;
    private int yearOfProduction;
    private String color;
    private int mileage;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Double amount;
}
