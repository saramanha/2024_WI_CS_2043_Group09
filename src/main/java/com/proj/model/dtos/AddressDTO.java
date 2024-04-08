package com.proj.model.dtos;

/**
 * DTO class representing an address.
 */
public class AddressDTO {
    private Long id; // Unique identifier for the address
    private String addressLine1; // First line of the address
    private String addressLine2; // Second line of the address
    private String streetName; // Street name of the address
    private CityDTO city; // City associated with the address
    private ProvinceDTO province; // Province associated with the address
    private CountryDTO country; // Country associated with the address

    /**
     * Constructor with parameters for creating an AddressDTO object.
     * 
     * @param id            The unique identifier for the address.
     * @param addressLine1  The first line of the address.
     * @param addressLine2  The second line of the address.
     * @param streetName    The street name of the address.
     * @param city          The city associated with the address.
     * @param province      The province associated with the address.
     * @param country       The country associated with the address.
     */
    public AddressDTO(Long id, String addressLine1, String addressLine2, String streetName, CityDTO city,
            ProvinceDTO province, CountryDTO country) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    /**
     * Default constructor for AddressDTO.
     */
    public AddressDTO() {
    }

    /**
     * Getter for the id field.
     * 
     * @return The id of the address.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for the id field.
     * 
     * @param id The id to set for the address.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for the addressLine1 field.
     * 
     * @return The first line of the address.
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for the addressLine1 field.
     * 
     * @param addressLine The first line of the address to set.
     */
    public void setAddressLine1(String addressLine) {
        this.addressLine1 = addressLine;
    }

    /**
     * Getter for the addressLine2 field.
     * 
     * @return The second line of the address.
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for the addressLine2 field.
     * 
     * @param addressLine The second line of the address to set.
     */
    public void setAddressLine2(String addressLine) {
        this.addressLine2 = addressLine;
    }

    /**
     * Getter for the streetName field.
     * 
     * @return The street name of the address.
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Setter for the streetName field.
     * 
     * @param streetName The street name of the address to set.
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Getter for the city field.
     * 
     * @return The city associated with the address.
     */
    public CityDTO getCity() {
        return city;
    }

    /**
     * Setter for the city field.
     * 
     * @param city The city associated with the address to set.
     */
    public void setCity(CityDTO city) {
        this.city = city;
    }

    /**
     * Getter for the province field.
     * 
     * @return The province associated with the address.
     */
    public ProvinceDTO getProvince() {
        return province;
    }

    /**
     * Setter for the province field.
     * 
     * @param province The province associated with the address to set.
     */
    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

    /**
     * Getter for the country field.
     * 
     * @return The country associated with the address.
     */
    public CountryDTO getCountry() {
        return country;
    }

    /**
     * Setter for the country field.
     * 
     * @param country The country associated with the address to set.
     */
    public void setCountry(CountryDTO country) {
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
        AddressDTO other = (AddressDTO) obj;
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

    @Override
    public String toString() {
        return "AddressDTO [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
                + ", streetName=" + streetName + ", city=" + city + ", province=" + province + ", country=" + country
                + "]";
    }
}
