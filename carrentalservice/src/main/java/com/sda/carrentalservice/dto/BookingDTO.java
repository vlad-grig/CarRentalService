package com.sda.carrentalservice.dto;

import java.util.Date;

public class BookingDTO extends BaseEntityDTO {

    private Date dateOfBooking;
    private CustomerDTO customerDTO;
    private CarDTO carDTO;
    private Date dateFrom;
    private Date dateTo;
    private RentalDTO rentalDTO;
    private ReturnCarDTO returnCarDTO;
    private Double amount;

    public BookingDTO() {
    }

    public BookingDTO(Long id, Date dateOfBooking, CustomerDTO customerDTO, CarDTO carDTO, Date dateFrom, Date dateTo, RentalDTO rentalDTO, ReturnCarDTO returnCarDTO, Double amount) {
        super(id);
        this.id = id;
        this.dateOfBooking = dateOfBooking;
        this.customerDTO = customerDTO;
        this.carDTO = carDTO;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.rentalDTO = rentalDTO;
        this.returnCarDTO = returnCarDTO;
        this.amount = amount;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public CarDTO getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
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

    public RentalDTO getRentalDTO() {
        return rentalDTO;
    }

    public void setRentalDTO(RentalDTO rentalDTO) {
        this.rentalDTO = rentalDTO;
    }

    public ReturnCarDTO getReturnCarDTO() {
        return returnCarDTO;
    }

    public void setReturnCar(ReturnCarDTO returnCarDTO) {
        this.returnCarDTO = returnCarDTO;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
