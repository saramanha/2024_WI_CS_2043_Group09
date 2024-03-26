package com.proj.model.dtos;

/**
 * A DTO (Data Transfer Object) representing the status of a transaction.
 */
public class TransactionStatusDTO {
    private Long id; // The unique identifier of the transaction status.
    private String description; // A brief description of the transaction status.
    private String name; // The name or label of the transaction status.

    /**
     * Constructs a TransactionStatusDTO object with the specified ID, description, and name.
     * @param id The ID of the transaction status.
     * @param description The description of the transaction status.
     * @param name The name of the transaction status.
     */
    public TransactionStatusDTO(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    /**
     * Constructs a TransactionStatusDTO object with default values.
     */
    public TransactionStatusDTO() {
    }

    /**
     * Retrieves the ID of the transaction status.
     * @return The ID of the transaction status.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the transaction status.
     * @param id The ID of the transaction status to be set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the description of the transaction status.
     * @return The description of the transaction status.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the transaction status.
     * @param description The description of the transaction status to be set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the name of the transaction status.
     * @return The name of the transaction status.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the transaction status.
     * @param name The name of the transaction status to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
}
