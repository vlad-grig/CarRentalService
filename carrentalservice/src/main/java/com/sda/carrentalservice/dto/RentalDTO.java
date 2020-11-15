package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Booking;
import com.sda.carrentalservice.entity.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalDTO {

    private Employee employee;
    private Date rentalDate;
    private List<Booking> bookingList = new ArrayList<>();
    private String comments;

    public RentalDTO(Employee employee, Date rentalDate, List<Booking> bookingList, String comments) {
        this.employee = employee;
        this.rentalDate = rentalDate;
        this.bookingList = bookingList;
        this.comments = comments;
    }

    public RentalDTO() {
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

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
