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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankBranchDTO other = (BankBranchDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BankBranchDTO [id=" + id + ", address=" + address + ", description=" + description + "]";
    }
}
