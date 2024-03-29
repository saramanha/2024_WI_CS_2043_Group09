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
        RoleEntity other = (RoleEntity) obj;
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
}
