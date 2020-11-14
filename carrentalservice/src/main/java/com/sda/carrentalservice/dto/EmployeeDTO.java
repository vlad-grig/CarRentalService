package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.entity.Rental;
import com.sda.carrentalservice.entity.ReturnCar;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private String workingBranch;
    private Branch branch;
    private ReturnCar returnCar;
    private Rental rental;
}
