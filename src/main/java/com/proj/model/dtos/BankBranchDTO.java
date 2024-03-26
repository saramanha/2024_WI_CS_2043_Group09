package com.proj.model.dtos;

/**
 * Represents a data transfer object (DTO) for a bank branch.
 */
public class BankBranchDTO {
    private Long id; // The unique identifier of the bank branch.
    private AddressDTO address; // The address of the bank branch.
    private String description; // The description of the bank branch.

    /**
     * Constructs a new BankBranchDTO object with the given parameters.
     * 
     * @param id          The unique identifier of the bank branch.
     * @param address     The address of the bank branch.
     * @param description The description of the bank branch.
     */
    public BankBranchDTO(Long id, AddressDTO address, String description) {
        this.id = id;
        this.address = address;
        this.description = description;
    }

    /**
     * Constructs a new empty BankBranchDTO object.
     */
    public BankBranchDTO() {
    }

    /**
     * Retrieves the unique identifier of the bank branch.
     * 
     * @return The unique identifier of the bank branch.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the bank branch.
     * 
     * @param id The unique identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the address of the bank branch.
     * 
     * @return The address of the bank branch.
     */
    public AddressDTO getAddress() {
        return address;
    }

    /**
     * Sets the address of the bank branch.
     * 
     * @param address The address to set.
     */
    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    /**
     * Retrieves the description of the bank branch.
     * 
     * @return The description of the bank branch.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the bank branch.
     * 
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
