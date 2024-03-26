package com.proj.model.dtos;

/**
 * Represents a DTO (Data Transfer Object) for a document type.
 */
public class DocumentTypeDTO {
    private Long id; // The ID of the document type.
    private String description;  // The description of the document type.

    /**
     * Constructs a DocumentTypeDTO object with the specified parameters.
     *
     * @param id          The ID of the document type.
     * @param description The description of the document type.
     */
    public DocumentTypeDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * Constructs an empty DocumentTypeDTO object.
     */
    public DocumentTypeDTO() {
    }

    /**
     * Retrieves the ID of the document type.
     *
     * @return The ID of the document type.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the document type.
     *
     * @param id The ID of the document type.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the description of the document type.
     *
     * @return The description of the document type.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the document type.
     *
     * @param description The description of the document type.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
