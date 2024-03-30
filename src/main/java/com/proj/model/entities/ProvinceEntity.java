package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the entity mapping for a province.
 */
@Entity
@Table(name = "province")
public class ProvinceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "province_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "province_name", nullable = false)
    private String provinceName;

    /**
     * Constructs a province entity with the provided parameters.
     * 
     * @param id           The province ID.
     * @param provinceName The name of the province.
     */
    public ProvinceEntity(Long id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    /**
     * Default constructor.
     */
    public ProvinceEntity() {
    }

    /**
     * Retrieves the ID of the province.
     * 
     * @return The province ID.
     */
    public Long getId() {
        return id;
    } 

    /**
     * Sets the ID of the province.
     * 
     * @param id The province ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the province.
     * 
     * @return The name of the province.
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the name of the province.
     * 
     * @param provinceName The name of the province to set.
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((provinceName == null) ? 0 : provinceName.hashCode());
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
		ProvinceEntity other = (ProvinceEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (provinceName == null) {
			if (other.provinceName != null)
				return false;
		} else if (!provinceName.equals(other.provinceName))
			return false;
		return true;
	}
}
