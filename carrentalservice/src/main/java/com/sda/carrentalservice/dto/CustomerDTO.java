package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Booking;

import java.util.ArrayList;
import java.util.List;

public class CustomerDTO extends BaseEntityDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private List<BookingDTO> bookingDTOList = new ArrayList<>();

    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String firstName, String lastName, String email, String address) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<BookingDTO> getBookingDTOList() {
        return bookingDTOList;
    }

    public void setBookingDTOList(List<BookingDTO> bookingDTOList) {
        this.bookingDTOList = bookingDTOList;
    }
}
