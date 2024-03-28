package com.proj.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * An entity class representing an address.
 */
@Entity // Specifies that this class is an entity
@Table(name = "address") // Specifies the table name for this entity
public class AddressEntity {
    
    @Id // Specifies the primary key for this entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key
    @Column(name = "address_id", nullable = false, updatable = false) // Specifies the column mapping for the ID field
    private Long id; // Unique identifier for the address

    @Column(name = "address_line_1", nullable = false) // Specifies the column mapping for the addressLine1 field
    private String addressLine1; // First line of the address

    @Column(name = "address_line_2") // Specifies the column mapping for the addressLine2 field
    private String addressLine2; // Second line of the address (optional)

    @Column(name = "street_name", nullable = false) // Specifies the column mapping for the streetName field
    private String streetName; // Street name

    @ManyToOne(cascade = CascadeType.MERGE) // Specifies the many-to-one relationship with CityEntity
    @JoinColumn(name = "city_id") // Specifies the column mapping for the city field
    private CityEntity city; // City of the address

    @ManyToOne(cascade = CascadeType.MERGE) // Specifies the many-to-one relationship with ProvinceEntity
    @JoinColumn(name = "province_id") // Specifies the column mapping for the province field
    private ProvinceEntity province; // Province of the address

    @ManyToOne(cascade = CascadeType.MERGE) // Specifies the many-to-one relationship with CountryEntity
    @JoinColumn(name = "country_id") // Specifies the column mapping for the country field
    private CountryEntity country; // Country of the address

    /**
     * Constructs an AddressEntity object.
     * 
     * @param id           The unique identifier for the address.
     * @param addressLine1 The first line of the address.
     * @param addressLine2 The second line of the address (optional).
     * @param streetName   The street name.
     * @param city         The city of the address.
     * @param province     The province of the address.
     * @param country      The country of the address.
     */
    public AddressEntity(Long id, String addressLine1, String addressLine2, String streetName, CityEntity city,
            ProvinceEntity province, CountryEntity country) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    /**
     * Default constructor.
     */
    public AddressEntity() {
    }

    /**
     * Retrieves the unique identifier for the address.
     *
     * @return The unique identifier for the address.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the address.
     *
     * @param id The unique identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the first line of the address.
     *
     * @return The first line of the address.
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the first line of the address.
     *
     * @param addressLine1 The first line of the address to set.
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Retrieves the second line of the address.
     *
     * @return The second line of the address.
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the second line of the address.
     *
     * @param addressLine2 The second line of the address to set.
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Retrieves the street name of the address.
     *
     * @return The street name of the address.
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the street name of the address.
     *
     * @param streetName The street name of the address to set.
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Retrieves the city of the address.
     *
     * @return The city of the address.
     */
    public CityEntity getCity() {
        return city;
    }

    /**
     * Sets the city of the address.
     *
     * @param city The city of the address to set.
     */
    public void setCity(CityEntity city) {
        this.city = city;
    }

    /**
     * Retrieves the province of the address.
     *
     * @return The province of the address.
     */
    public ProvinceEntity getProvince() {
        return province;
    }

    /**
     * Sets the province of the address.
     *
     * @param province The province of the address to set.
     */
    public void setProvince(ProvinceEntity province) {
        this.province = province;
    }

    /**
     * Retrieves the country of the address.
     *
     * @return The country of the address.
     */
    public CountryEntity getCountry() {
        return country;
    }

    /**
     * Sets the country of the address.
     *
     * @param country The country of the address to set.
     */
    public void setCountry(CountryEntity country) {
        this.country = country;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		AddressEntity other = (AddressEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null) {
			if (other.addressLine2 != null)
				return false;
		} else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}
}
