package com.sda.carrentalservice.entity;

import java.util.List;

public class Branch {

    private Long id;
    private String address;
    private List<Employee> employees;
    private List<Car> cars;

    public Branch(String address, List<Employee> employees, List<Car> cars) {
        this.address = address;
        this.employees = employees;
        this.cars = cars;
    }

    public Branch() {
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
}
