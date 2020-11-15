package com.sda.carrentalservice.dto;

import java.util.Date;

public class BookingDTO {

    private Long id;
    private Date dateOfBooking;
    private String client;
    private CarDTO carDTO;
    private Date dateFrom;
    private Date dateTo;
    private RentalDTO rentalDTO;
    private ReturnCarDTO returnCarDTO;
    private Double amount;

    public BookingDTO() {
    }

    public BookingDTO(Long id, Date dateOfBooking, String client, CarDTO carDTO, Date dateFrom, Date dateTo, RentalDTO rentalDTO, ReturnCarDTO returnCarDTO, Double amount) {
        this.id = id;
        this.dateOfBooking = dateOfBooking;
        this.client = client;
        this.carDTO = carDTO;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.rentalDTO = rentalDTO;
        this.returnCarDTO = returnCarDTO;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
