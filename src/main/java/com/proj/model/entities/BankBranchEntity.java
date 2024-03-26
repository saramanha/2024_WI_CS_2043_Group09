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
}
