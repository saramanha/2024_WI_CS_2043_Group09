package com.proj.model.dtos;

import java.util.Arrays;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((documentType == null) ? 0 : documentType.hashCode());
        result = prime * result + ((agent == null) ? 0 : agent.hashCode());
        result = prime * result + Arrays.hashCode(content);
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
        DocumentDTO other = (DocumentDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (documentType == null) {
            if (other.documentType != null)
                return false;
        } else if (!documentType.equals(other.documentType))
            return false;
        if (agent == null) {
            if (other.agent != null)
                return false;
        } else if (!agent.equals(other.agent))
            return false;
        if (!Arrays.equals(content, other.content))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DocumentDTO [id=" + id + ", documentType=" + documentType + ", agent=" + agent + ", content="
                + Arrays.toString(content) + "]";
    }
}
