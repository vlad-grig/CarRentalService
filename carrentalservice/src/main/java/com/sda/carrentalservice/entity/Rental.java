package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Rental extends BaseEntity{

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Employee employee;

    @Temporal(TemporalType.DATE)
    private Date rentalDate;

    @OneToOne(mappedBy = "rental", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Booking booking;

    private String comments;

    public Rental(Employee employee, Date rentalDate, Booking booking, String comments) {
        this.employee = employee;
        this.rentalDate = rentalDate;
        this.booking = booking;
        this.comments = comments;
    }

    public Rental() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
