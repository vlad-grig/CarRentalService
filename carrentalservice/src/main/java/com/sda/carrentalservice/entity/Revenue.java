package com.sda.carrentalservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Revenue extends BaseEntity{

    private Double sumOfAmountsForCarRental;
    private Double dailyRevenue;
    private Double weeklyRevenue;
    private Double monthlyRevenue;
    private Double yearlyRevenue;

    public Revenue() {
    }

    public Revenue(Double sumOfAmountsForCarRental, Double dailyRevenue, Double weeklyRevenue, Double monthlyRevenue, Double yearlyRevenue) {
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
        this.dailyRevenue = dailyRevenue;
        this.weeklyRevenue = weeklyRevenue;
        this.monthlyRevenue = monthlyRevenue;
        this.yearlyRevenue = yearlyRevenue;
    }

    public Double getSumOfAmountsForCarRental() {
        return sumOfAmountsForCarRental;
    }

    public void setSumOfAmountsForCarRental(Double sumOfAmountsForCarRental) {
        this.sumOfAmountsForCarRental = sumOfAmountsForCarRental;
    }

    public void getDailyRevenue(Double dailyRevenue) {
        this.dailyRevenue = dailyRevenue;
    }

    public void getWeeklyRevenue(Double weeklyRevenue) {
        this.weeklyRevenue = weeklyRevenue;
    }

    public void getMonthlyRevenue(Double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    public void getYearlyRevenue(Double yearlyRevenue) {
        this.yearlyRevenue = yearlyRevenue;
    }
}
