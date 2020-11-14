package com.sda.carrentalservice.entity;

// la enum nu se pune anotarea @Entity
public enum Status {
    NOT_AVAILABLE, BROKEN, IN_REPAIR, IN_SERVICE;

    Status() {
    }
}
