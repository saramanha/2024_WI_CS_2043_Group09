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
}
