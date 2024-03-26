package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;

/**
 * Represents the entity mapping for documents.
 */
@Entity
@Table(name = "document")
public class DocumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "document_type_id")
    private DocumentTypeEntity documentType;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @Lob
    @Column(name = "content")
    private byte[] content;

    /**
     * Constructs a document entity with the provided parameters.
     * 
     * @param id            The document ID.
     * @param documentType  The document type associated with the document.
     * @param agent         The agent associated with the document.
     * @param content       The content of the document.
     */
    public DocumentEntity(Long id, DocumentTypeEntity documentType, AgentInformationEntity agent, byte[] content) {
        this.id = id;
        this.documentType = documentType;
        this.agent = agent;
        this.content = content;
    }

    /**
     * Default constructor.
     */
    public DocumentEntity() {
    }

    /**
     * Retrieves the ID of the document.
     * 
     * @return The document ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the document.
     * 
     * @param id The document ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the document type associated with the document.
     * 
     * @return The document type entity.
     */
    public DocumentTypeEntity getDocumentType() {
        return documentType;
    }

    /**
     * Sets the document type associated with the document.
     * 
     * @param documentType The document type entity to set.
     */
    public void setDocumentType(DocumentTypeEntity documentType) {
        this.documentType = documentType;
    }

    /**
     * Retrieves the agent associated with the document.
     * 
     * @return The agent information entity.
     */
    public AgentInformationEntity getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the document.
     * 
     * @param agent The agent information entity to set.
     */
    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the content of the document.
     * 
     * @return The content of the document as a byte array.
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the content of the document.
     * 
     * @param content The content of the document as a byte array.
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}
