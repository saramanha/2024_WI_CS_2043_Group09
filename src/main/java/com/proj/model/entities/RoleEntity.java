package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the entity mapping for a role.
 */
@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
    
    /**
     * Constructs a role entity with the provided parameters.
     * 
     * @param id          The role ID.
     * @param name        The name of the role.
     * @param description The description of the role.
     */
    public RoleEntity(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Default constructor.
     */
    public RoleEntity() {
    }

    /**
     * Retrieves the ID of the role.
     * 
     * @return The role ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the role.
     * 
     * @param id The role ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the role.
     * 
     * @return The name of the role.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the role.
     * 
     * @param name The name of the role to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retrieves the description of the role.
     * 
     * @return The description of the role.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the description of the role.
     * 
     * @param description The description of the role to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
