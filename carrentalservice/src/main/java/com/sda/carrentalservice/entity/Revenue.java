package com.sda.carrentalservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double sumOfAmountsForCarRental;

    public Revenue(Double sumOfAmountsForCarRental) {
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
    }

    public Revenue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long revenueId) {
        this.id = revenueId;
    }

    public Double getSumOfAmountsForCarRental() {
        return sumOfAmountsForCarRental;
    }

    public void setSumOfAmountsForCarRental(Double sumOfAmountsForCarRental) {
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
    }
}