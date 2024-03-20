package com.proj.model.dtos;

public class ProvinceDTO {
    
    
    
    private Long id;

    
    private String provinceName;

    public ProvinceDTO(Long id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    public ProvinceDTO() {
    }

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
