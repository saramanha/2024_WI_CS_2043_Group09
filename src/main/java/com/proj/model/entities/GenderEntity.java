package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the entity mapping for gender.
 */
@Entity
@Table(name = "gender")
public class GenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gender_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
    
    /**
     * Constructs a gender entity with the provided parameters.
     * 
     * @param id          The gender ID.
     * @param name        The name of the gender.
     * @param description The description of the gender.
     */
    public GenderEntity(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Default constructor.
     */
    public GenderEntity() {
    }

    /**
     * Retrieves the ID of the gender.
     * 
     * @return The gender ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the gender.
     * 
     * @param id The gender ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the gender.
     * 
     * @return The name of the gender.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the gender.
     * 
     * @param name The name of the gender to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Retrieves the description of the gender.
     * 
     * @return The description of the gender.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the description of the gender.
     * 
     * @param description The description of the gender to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
