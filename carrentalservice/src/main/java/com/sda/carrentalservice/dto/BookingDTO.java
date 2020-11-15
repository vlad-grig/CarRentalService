package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.entity.Rental;
import com.sda.carrentalservice.entity.ReturnCar;

import javax.persistence.*;
import java.util.Date;

public class BookingDTO {

    private Long id;
    private Date dateOfBooking;
    private String client;
    private Car car;
    private Date dateFrom;
    private Date dateTo;
    private Rental rental;
    private ReturnCar returnCar;
    private Double amount;

    public BookingDTO() {
    }

    public BookingDTO(Long id, Date dateOfBooking, String client, Car car, Date dateFrom, Date dateTo, Rental rental, ReturnCar returnCar, Double amount) {
        this.id = id;
        this.dateOfBooking = dateOfBooking;
        this.client = client;
        this.car = car;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.rental = rental;
        this.returnCar = returnCar;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public ReturnCar getReturnCar() {
        return returnCar;
    }

    public void setReturnCar(ReturnCar returnCar) {
        this.returnCar = returnCar;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
