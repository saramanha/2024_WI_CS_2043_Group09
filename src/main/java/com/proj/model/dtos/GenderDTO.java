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
}
