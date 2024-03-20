package com.proj.model.dtos;



public class DocumentTypeDTO {
    
    
    
    private Long id;

    
    private String description;

    public DocumentTypeDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public DocumentTypeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
