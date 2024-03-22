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

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;
    
    @Column(name = "street_name", nullable = false)
    private String streetName;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "province_id")
    private ProvinceEntity province;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "country_id")
    private CountryEntity country;

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

    public AddressEntity() {
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

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public ProvinceEntity getProvince() {
        return province;
    }

    public void setProvince(ProvinceEntity province) {
        this.province = province;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }
}
