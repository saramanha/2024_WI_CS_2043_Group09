package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a city entity.
 */
@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    /**
     * Constructs a city entity with the provided parameters.
     * 
     * @param id       The ID of the city.
     * @param cityName The name of the city.
     */
    public CityEntity(Long id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    /**
     * Default constructor.
     */
    public CityEntity() {
    }

    /**
     * Retrieves the ID of the city.
     * 
     * @return The ID of the city.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the city.
     * 
     * @param id The ID to set for the city.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the city.
     * 
     * @return The name of the city.
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the name of the city.
     * 
     * @param cityName The name to set for the city.
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
