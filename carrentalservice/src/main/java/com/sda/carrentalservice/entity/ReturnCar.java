package com.sda.carrentalservice.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ReturnCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Employee employee;

    private LocalDate rentalDate;

    @OneToMany(mappedBy = "returnCar", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Booking> bookingList = new ArrayList<>();

    private String comments;

    public ReturnCar() {
    }

    public ReturnCar(Long id, Employee employee, LocalDate rentalDate, List<Booking> bookingList, String comments) {
        this.id = id;
        this.employee = employee;
        this.rentalDate = rentalDate;
        this.bookingList = bookingList;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
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
