package com.proj.model.dtos;

/**
 * Represents a data transfer object (DTO) for a country.
 */
public class CountryDTO {
    private Long id; // The identifier of the country.
    private String countryName; // The name of the country.

    /**
     * Constructs a new CountryDTO object with the given parameters.
     * 
     * @param id          The identifier of the country.
     * @param countryName The name of the country.
     */
    public CountryDTO(Long id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    /**
     * Constructs a new empty CountryDTO object.
     */
    public CountryDTO() {
    }

    /**
     * Retrieves the identifier of the country.
     * 
     * @return The country identifier.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the identifier of the country.
     * 
     * @param id The country identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the country.
     * 
     * @return The country name.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the name of the country.
     * 
     * @param countryName The country name to set.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
