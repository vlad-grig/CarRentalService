package com.sda.carrentalservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public enum Status {
    NOT_AVAILABLE, BROKEN, IN_REPAIR, IN_SERVICE;


}
