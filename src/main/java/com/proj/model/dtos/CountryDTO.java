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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
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
        CountryDTO other = (CountryDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (countryName == null) {
            if (other.countryName != null)
                return false;
        } else if (!countryName.equals(other.countryName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CountryDTO [id=" + id + ", countryName=" + countryName + "]";
    }
}
