package com.proj.model.dtos;

/**
 * A Data Transfer Object (DTO) representing gender information.
 */
public class GenderDTO {
    private Long id; // The unique identifier of the gender.
    private String name; // The name of the gender.
    private String description; // The description of the gender.

    /**
     * Constructs a new GenderDTO object with specified parameters.
     * @param id The unique identifier of the gender.
     * @param name The name of the gender.
     * @param description The description of the gender.
     */
    public GenderDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Default constructor for GenderDTO.
     */
    public GenderDTO() {
    }

    /**
     * Retrieves the ID of the gender.
     * @return The ID of the gender.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the gender.
     * @param id The ID of the gender.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the gender.
     * @return The name of the gender.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the gender.
     * @param name The name of the gender.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retrieves the description of the gender.
     * @return The description of the gender.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the description of the gender.
     * @param description The description of the gender.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        GenderDTO other = (GenderDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GenderDTO [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
