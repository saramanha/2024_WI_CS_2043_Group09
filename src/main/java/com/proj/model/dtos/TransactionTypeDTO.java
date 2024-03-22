package com.proj.model.dtos;

public class TransactionTypeDTO {
    
    
    
    private Long id;

    
    private String description;
   
    
    private String name;

    public TransactionTypeDTO(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public TransactionTypeDTO() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
