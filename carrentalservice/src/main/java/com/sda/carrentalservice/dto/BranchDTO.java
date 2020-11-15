package com.sda.carrentalservice.dto;

import java.util.List;

public class BranchDTO {

    private Long id;
    private String address;
    private List<EmployeeDTO> employees;
    private List<CarDTO> carsDTO;
    private RentalOfficeDTO rentalOfficeDTO;

    public BranchDTO(Long id, String address, List<EmployeeDTO> employees, List<CarDTO> carsDTO, RentalOfficeDTO rentalOfficeDTO) {
        this.id = id;
        this.address = address;
        this.employees = employees;
        this.carsDTO = carsDTO;
        this.rentalOfficeDTO = rentalOfficeDTO;
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

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public List<CarDTO> getCarsDTO() {
        return carsDTO;
    }

    public void setCarsDTO(List<CarDTO> cars) {
        this.carsDTO = carsDTO;
    }

    public RentalOfficeDTO getRentalOfficeDTO() {
        return rentalOfficeDTO;
    }

    public void setRentalOfficeDTO(RentalOfficeDTO rentalOfficeDTO) {
        this.rentalOfficeDTO = rentalOfficeDTO;
    }
}
