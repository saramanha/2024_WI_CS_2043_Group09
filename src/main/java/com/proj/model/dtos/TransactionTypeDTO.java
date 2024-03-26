package com.proj.model.dtos;

/**
 * A DTO (Data Transfer Object) representing the type of a transaction.
 */
public class TransactionTypeDTO {
    private Long id; // The unique identifier of the transaction type.
    private String description; // A brief description of the transaction type.
    private String name; // The name or label of the transaction type.

    /**
     * Constructs a TransactionTypeDTO object with the specified ID, description, and name.
     * @param id The ID of the transaction type.
     * @param description The description of the transaction type.
     * @param name The name of the transaction type.
     */
    public TransactionTypeDTO(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    /**
     * Constructs a TransactionTypeDTO object with default values.
     */
    public TransactionTypeDTO() {
    }

    /**
     * Retrieves the ID of the transaction type.
     * @return The ID of the transaction type.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the transaction type.
     * @param id The ID of the transaction type.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the description of the transaction type.
     * @return The description of the transaction type.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the transaction type.
     * @param description The description of the transaction type.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the name of the transaction type.
     * @return The name of the transaction type.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the transaction type.
     * @param name The name of the transaction type.
     */
    public void setName(String name) {
        this.name = name;
    }
}
