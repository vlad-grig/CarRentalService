package com.sda.carrentalservice.dto;

import java.util.Date;
import java.util.List;

public class RentalDTO {

    private EmployeeDTO employeeDTO;
    private Date rentalDate;
    private List<BookingDTO> bookingListDTO;
    private String comments;

    public RentalDTO(EmployeeDTO employeeDTO, Date rentalDate, List<BookingDTO> bookingListDTO, String comments) {
        this.employeeDTO = employeeDTO;
        this.rentalDate = rentalDate;
        this.bookingListDTO = bookingListDTO;
        this.comments = comments;
    }

    public RentalDTO() {
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public List<BookingDTO> getBookingListDTO() {
        return bookingListDTO;
    }

    public void setBookingList(List<BookingDTO> bookingListDTO) {
        this.bookingListDTO = bookingListDTO;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
