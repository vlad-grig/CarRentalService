package com.sda.carrentalservice.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Rental extends BaseEntity {

    @OneToOne
    private Employee employeeForRental;

    @NotNull(message = "Date cannot be blank.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date rentalDate;

    @OneToOne(mappedBy = "rental", fetch = FetchType.LAZY)
    private Booking booking;

    private String comments;

    public Rental(Employee employeeForRental, Date rentalDate, Booking booking, String comments) {
        this.employeeForRental = employeeForRental;
        this.rentalDate = rentalDate;
        this.booking = booking;
        this.comments = comments;
    }

    public Rental() {
    }

    public Employee getEmployee() {
        return employeeForRental;
    }

    public void setEmployee(Employee employeeForRental) {
        this.employeeForRental = employeeForRental;
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
