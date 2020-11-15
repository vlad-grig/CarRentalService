package com.sda.carrentalservice.dto;

import java.util.List;

public class RentalOfficeDTO {

    private Long id;
    private String name;
    private String internetDomain;
    private String contactAddress;
    private String owner;
    private String logoType;
    private List<BranchDTO> branchesDTO;

    public RentalOfficeDTO(Long id, String name, String internetDomain, String contactAddress, String owner, String logoType, List<BranchDTO> branchesDTO) {
        this.id = id;
        this.name = name;
        this.internetDomain = internetDomain;
        this.contactAddress = contactAddress;
        this.owner = owner;
        this.logoType = logoType;
        this.branchesDTO = branchesDTO;
    }

    public RentalOfficeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInternetDomain() {
        return internetDomain;
    }

    public void setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    public List<BranchDTO> getBranchesDTO() {
        return branchesDTO;
    }

    public void setBranchesDTO(List<BranchDTO> branchesDTO) {
        this.branchesDTO = branchesDTO;
    }
}
