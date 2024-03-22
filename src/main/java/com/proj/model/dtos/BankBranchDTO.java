package com.proj.model.dtos;
public class BankBranchDTO {
    private Long id;
    private AddressDTO address;
    private String description;

    public BankBranchDTO(Long id, AddressDTO address, String description) {
        this.id = id;
        this.address = address;
        this.description = description;
    }

    public BankBranchDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
