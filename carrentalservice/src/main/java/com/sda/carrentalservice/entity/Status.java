package com.sda.carrentalservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum Status {
    NOT_AVAILABLE, BROKEN, IN_REPAIR, IN_SERVICE;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
