package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_status")
public class TransactionStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_status_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Constructs a new TransactionStatusEntity object with the given id, description, and name.
     * 
     * @param id          The id of the transaction status.
     * @param description The description of the transaction status.
     * @param name        The name of the transaction status.
     */
    public TransactionStatusEntity(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    /**
     * Default constructor for the TransactionStatusEntity class.
     */
    public TransactionStatusEntity() {
    }

    /**
     * Retrieves the id of the transaction status.
     * 
     * @return The id of the transaction status.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the transaction status.
     * 
     * @param id The id to set for the transaction status.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the description of the transaction status.
     * 
     * @return The description of the transaction status.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the transaction status.
     * 
     * @param description The description to set for the transaction status.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the name of the transaction status.
     * 
     * @return The name of the transaction status.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the transaction status.
     * 
     * @param name The name to set for the transaction status.
     */
    public void setName(String name) {
        this.name = name;
    }
}
