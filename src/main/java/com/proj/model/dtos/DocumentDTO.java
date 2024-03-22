package com.proj.model.dtos;

public class DocumentDTO {
    
    
    
    private Long id;

    
    
    private DocumentTypeDTO documentType;

    
    
    private AgentInformationDTO agent;

    
    
    private byte[] content;

    public DocumentDTO(Long id, DocumentTypeDTO documentType, AgentInformationDTO agent, byte[] content) {
        this.id = id;
        this.documentType = documentType;
        this.agent = agent;
        this.content = content;
    }

    public DocumentDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DocumentTypeDTO getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeDTO documentType) {
        this.documentType = documentType;
    }

    public AgentInformationDTO getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
