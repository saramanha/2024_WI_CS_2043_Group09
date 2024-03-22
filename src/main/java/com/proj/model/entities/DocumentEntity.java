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

    public DocumentEntity(Long id, DocumentTypeEntity documentType, AgentInformationEntity agent, byte[] content) {
        this.id = id;
        this.documentType = documentType;
        this.agent = agent;
        this.content = content;
    }

    public DocumentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DocumentTypeEntity getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeEntity documentType) {
        this.documentType = documentType;
    }

    public AgentInformationEntity getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
