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
@Table(name = "country")
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
		CountryEntity other = (CountryEntity) obj;
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
}
