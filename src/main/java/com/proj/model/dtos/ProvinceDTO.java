package com.proj.model.dtos;

/**
 * A Data Transfer Object (DTO) representing province information.
 */
public class ProvinceDTO {
    private Long id; // The unique identifier of the province.
    private String provinceName; // The name of the province.

    /**
     * Constructs a new ProvinceDTO object with specified parameters.
     * @param id The unique identifier of the province.
     * @param provinceName The name of the province.
     */
    public ProvinceDTO(Long id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    /**
     * Default constructor for ProvinceDTO.
     */
    public ProvinceDTO() {
    }

    /**
     * Retrieves the ID of the province.
     * @return The ID of the province.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the province.
     * @param id The ID of the province.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the province.
     * @return The name of the province.
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the name of the province.
     * @param provinceName The name of the province.
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
        ProvinceDTO other = (ProvinceDTO) obj;
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

    @Override
    public String toString() {
        return "ProvinceDTO [id=" + id + ", provinceName=" + provinceName + "]";
    }
}
