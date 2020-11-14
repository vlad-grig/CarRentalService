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

    public Revenue() {
    }

    public Revenue(Long id, Double sumOfAmountsForCarRental) {
        this.id = id;
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
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
