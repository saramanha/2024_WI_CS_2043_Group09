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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        DocumentTypeDTO other = (DocumentTypeDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
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
        return "DocumentTypeDTO [id=" + id + ", description=" + description + "]";
    }
}
