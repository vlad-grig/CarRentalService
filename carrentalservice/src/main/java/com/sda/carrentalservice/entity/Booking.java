package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateOfBooking;

    private String client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Car car;

    @Temporal(TemporalType.DATE)
    private Date dateFrom;

    @Temporal(TemporalType.DATE)
    private Date dateTo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Rental rental;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private ReturnCar returnCar;

    private Double amount;

    public Booking() {
    }

    public Booking(Date dateOfBooking, String client, Car car, Date dateFrom, Date dateTo, Rental rental, ReturnCar returnCar, Double amount) {
        this.dateOfBooking = dateOfBooking;
        this.client = client;
        this.car = car;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.rental = rental;
        this.returnCar = returnCar;
        this.amount = amount;
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
