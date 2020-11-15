package com.sda.carrentalservice.dto;

public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private BranchDTO workingBranchDTO;
    private ReturnCarDTO returnCarDTO;
    private RentalDTO rentalDTO;

    public EmployeeDTO(Long id, String firstName, String lastName, String jobPosition, BranchDTO workingBranchDTO, ReturnCarDTO returnCarDTO, RentalDTO rentalDTO) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.workingBranchDTO = workingBranchDTO;
        this.returnCarDTO = returnCarDTO;
        this.rentalDTO = rentalDTO;
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

    public BranchDTO getBranchDTO() {
        return workingBranchDTO;
    }

    public void setBranch(BranchDTO workingBranchDTO) {
        this.workingBranchDTO = workingBranchDTO;
    }

    public ReturnCarDTO getReturnCarDTO() {
        return returnCarDTO;
    }

    public void setReturnCarDTO(ReturnCarDTO returnCarDTO) {
        this.returnCarDTO = returnCarDTO;
    }

    public RentalDTO getRentalDTO() {
        return rentalDTO;
    }

    public void setRental(RentalDTO rentalDTO) {
        this.rentalDTO = rentalDTO;
    }
}
