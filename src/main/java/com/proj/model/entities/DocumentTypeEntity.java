package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the entity mapping for document types.
 */
@Entity
@Table(name = "document_type")
public class DocumentTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_type_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    /**
     * Constructs a document type entity with the provided parameters.
     * 
     * @param id           The document type ID.
     * @param description  The description of the document type.
     */
    public DocumentTypeEntity(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * Default constructor.
     */
    public DocumentTypeEntity() {
    }

    /**
     * Retrieves the ID of the document type.
     * 
     * @return The document type ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the document type.
     * 
     * @param id The document type ID to set.
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
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
