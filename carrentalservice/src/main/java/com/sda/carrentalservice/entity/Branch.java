package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Branch extends BaseEntity{

    private String address;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Car> cars;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private RentalOffice rentalOffice;

    public Branch(String address, List<Employee> employees, List<Car> cars, RentalOffice rentalOffice) {
        this.address = address;
        this.employees = employees;
        this.cars = cars;
        this.rentalOffice = rentalOffice;
    }

    public Branch() {
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
}
