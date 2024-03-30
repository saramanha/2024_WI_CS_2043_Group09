package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;

/**
 * Represents a bank branch entity.
 */
@Entity
@Table(name = "bank_branch")
public class BankBranchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_branch_id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @Column(name = "description")
    private String description;

    /**
     * Constructs a bank branch entity with provided parameters.
     * 
     * @param id          The ID of the bank branch.
     * @param address     The address of the bank branch.
     * @param description The description of the bank branch.
     */
    public BankBranchEntity(Long id, AddressEntity address, String description) {
        this.id = id;
        this.address = address;
        this.description = description;
    }

    /**
     * Default constructor.
     */
    public BankBranchEntity() {
    }

    /**
     * Retrieves the ID of the bank branch.
     * 
     * @return The ID of the bank branch.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the bank branch.
     * 
     * @param id The ID to set for the bank branch.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the address of the bank branch.
     * 
     * @return The address of the bank branch.
     */
    public AddressEntity getAddress() {
        return address;
    }

    /**
     * Sets the address of the bank branch.
     * 
     * @param address The address to set for the bank branch.
     */
    public void setAddress(AddressEntity address) {
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
     * @param description The description to set for the bank branch.
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
		BankBranchEntity other = (BankBranchEntity) obj;
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
}
