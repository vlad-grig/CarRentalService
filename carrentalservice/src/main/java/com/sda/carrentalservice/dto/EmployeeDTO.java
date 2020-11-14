package com.sda.carrentalservice.dto;

import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.entity.Rental;
import com.sda.carrentalservice.entity.ReturnCar;

public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private String workingBranch;
    private Branch branch;
    private ReturnCar returnCar;
    private Rental rental;

    public EmployeeDTO(Long id, String firstName, String lastName, String jobPosition, String workingBranch, Branch branch, ReturnCar returnCar, Rental rental) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.workingBranch = workingBranch;
        this.branch = branch;
        this.returnCar = returnCar;
        this.rental = rental;
    }

    public EmployeeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getWorkingBranch() {
        return workingBranch;
    }

    public void setWorkingBranch(String workingBranch) {
        this.workingBranch = workingBranch;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public ReturnCar getReturnCar() {
        return returnCar;
    }

    public void setReturnCar(ReturnCar returnCar) {
        this.returnCar = returnCar;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }
}
