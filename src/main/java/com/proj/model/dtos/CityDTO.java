package com.proj.model.dtos;

/**
 * Represents a data transfer object (DTO) for a city.
 */
public class CityDTO {
    private Long id; // The unique identifier of the city.
    private String cityName; // The name of the city.

    /**
     * Constructs a new CityDTO object with the given parameters.
     * 
     * @param id        The unique identifier of the city.
     * @param cityName  The name of the city.
     */
    public CityDTO(Long id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    /**
     * Constructs a new empty CityDTO object.
     */
    public CityDTO() {
    }

    /**
     * Retrieves the unique identifier of the city.
     * 
     * @return The unique identifier of the city.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the city.
     * 
     * @param id The unique identifier to set.
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
     * @param cityName The name to set.
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
