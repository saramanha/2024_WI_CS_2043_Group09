package com.proj.model.dtos;

/**
 * A Data Transfer Object (DTO) representing role information.
 */
public class RoleDTO {
    private Long id; // The unique identifier of the role.
    private String name; // The name of the role.
    private String description; // The description of the role.

    /**
     * Constructs a new RoleDTO object with specified parameters.
     * @param id The unique identifier of the role.
     * @param name The name of the role.
     * @param description The description of the role.
     */
    public RoleDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Default constructor for RoleDTO.
     */
    public RoleDTO() {
    }

    /**
     * Retrieves the ID of the role.
     * @return The ID of the role.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the role.
     * @param id The ID of the role.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the role.
     * @return The name of the role.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the role.
     * @param name The name of the role.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the description of the role.
     * @return The description of the role.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the role.
     * @param description The description of the role.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
