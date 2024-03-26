package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the entity mapping for a country.
 */
@Entity
@Table(name = "county")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "country_name", nullable = false)
    private String countryName;

    /**
     * Constructs a country entity with the provided parameters.
     * 
     * @param id          The ID of the country.
     * @param countryName The name of the country.
     */
    public CountryEntity(Long id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    /**
     * Default constructor.
     */
    public CountryEntity() {
    }

    /**
     * Retrieves the ID of the country.
     * 
     * @return The ID of the country.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the country.
     * 
     * @param id The ID to set for the country.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the country.
     * 
     * @return The name of the country.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the name of the country.
     * 
     * @param countryName The name to set for the country.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
