package com.sda.carrentalservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Revenue extends BaseEntity{

    private Double sumOfAmountsForCarRental;

    public Revenue(Double sumOfAmountsForCarRental) {
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
    }

    public Revenue() {
    }

    public Double getSumOfAmountsForCarRental() {
        return sumOfAmountsForCarRental;
    }

    public void setSumOfAmountsForCarRental(Double sumOfAmountsForCarRental) {
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
    }
}
