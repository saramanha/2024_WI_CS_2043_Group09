package com.proj.model.dtos;

public class AddressDTO {
    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String streetName;
    private CityDTO city;
    private ProvinceDTO province;
    private CountryDTO country;

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

    public AddressDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine) {
        this.addressLine1 = addressLine;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine) {
        this.addressLine2 = addressLine;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }
}
