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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
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
        CityDTO other = (CityDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (cityName == null) {
            if (other.cityName != null)
                return false;
        } else if (!cityName.equals(other.cityName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CityDTO [id=" + id + ", cityName=" + cityName + "]";
    }
}
