package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.entity.Employee;
import com.sda.carrentalservice.entity.RentalOffice;

import javax.persistence.*;
import java.util.List;

public class BranchDTO {

    private Long id;
    private String address;
    private List<Employee> employees;
    private List<Car> cars;
    private RentalOffice rentalOffice;

    public BranchDTO(Long id, String address, List<Employee> employees, List<Car> cars, RentalOffice rentalOffice) {
        this.id = id;
        this.address = address;
        this.employees = employees;
        this.cars = cars;
        this.rentalOffice = rentalOffice;
    }

    public BranchDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
