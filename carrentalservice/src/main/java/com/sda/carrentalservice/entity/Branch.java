package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Branch extends BaseEntity {

    private String address;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> cars;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private RentalOffice rentalOffice;

    @OneToMany(mappedBy = "rentalBranch", cascade = CascadeType.ALL)
    private List<Booking> bookingListRental = new ArrayList<>();

    @OneToMany(mappedBy = "returnBranch", cascade = CascadeType.ALL)
    private List<Booking> bookingListReturn = new ArrayList<>();

    public Branch(String address, List<Employee> employees, List<Car> cars, RentalOffice rentalOffice) {
        this.address = address;
        this.employees = employees;
        this.cars = cars;
        this.rentalOffice = rentalOffice;
    }

    public Branch() {
    }


    public Branch(String address, List<Employee> employees, List<Car> cars, RentalOffice rentalOffice, List<Booking> bookingListRental, List<Booking> bookingListReturn) {
        this.address = address;
        this.employees = employees;
        this.cars = cars;
        this.rentalOffice = rentalOffice;
        this.bookingListRental = bookingListRental;
        this.bookingListReturn = bookingListReturn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public List<Booking> getBookingListRental() {
        return bookingListRental;
    }

    public void setBookingListRental(List<Booking> bookingListRental) {
        this.bookingListRental = bookingListRental;
    }

    public List<Booking> getBookingListReturn() {
        return bookingListReturn;
    }

    public void setBookingListReturn(List<Booking> bookingListReturn) {
        this.bookingListReturn = bookingListReturn;
    }
}
