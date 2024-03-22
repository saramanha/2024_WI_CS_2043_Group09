package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "province")
public class ProvinceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "province_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "province_name", nullable = false)
    private String provinceName;

    public ProvinceEntity(Long id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    public ProvinceEntity() {
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
