package com.proj.model.dtos;

public class DocumentDTO {
    private Long id;
    private DocumentTypeDTO documentType;
    private AgentInformationDTO agent;
    private byte[] content;

    /**
     * Constructs a DocumentDTO object with the specified parameters.
     *
     * @param id            The ID of the document.
     * @param documentType  The type of the document.
     * @param agent         The agent associated with the document.
     * @param content       The content of the document as a byte array.
     */
    public DocumentDTO(Long id, DocumentTypeDTO documentType, AgentInformationDTO agent, byte[] content) {
        this.id = id;
        this.documentType = documentType;
        this.agent = agent;
        this.content = content;
    }

    /**
     * Constructs an empty DocumentDTO object.
     */
    public DocumentDTO() {
    }

    /**
     * Retrieves the ID of the document.
     *
     * @return The ID of the document.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the document.
     *
     * @param id The ID of the document.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the type of the document.
     *
     * @return The type of the document.
     */
    public DocumentTypeDTO getDocumentType() {
        return documentType;
    }

    /**
     * Sets the type of the document.
     *
     * @param documentType The type of the document.
     */
    public void setDocumentType(DocumentTypeDTO documentType) {
        this.documentType = documentType;
    }

    /**
     * Retrieves the agent associated with the document.
     *
     * @return The agent associated with the document.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the document.
     *
     * @param agent The agent associated with the document.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the content of the document as a byte array.
     *
     * @return The content of the document as a byte array.
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the content of the document as a byte array.
     *
     * @param content The content of the document as a byte array.
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}
