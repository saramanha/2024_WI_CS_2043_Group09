package com.proj.model.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proj.model.dtos.AddressDTO;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.CityEntity;
import com.proj.model.entities.CountryEntity;
import com.proj.model.entities.ProvinceEntity;
import com.proj.model.mappers.AddressMapper;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.ProvinceRepository;

@Service
public class AddressService {
    private AddressRepository addressRepository;
    private CityRepository cityRepository;
    private CountryRepository countryRepository;
    private ProvinceRepository provinceRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository, CityRepository cityRepository,
            CountryRepository countryRepository, ProvinceRepository provinceRepository) {
        this.addressRepository = addressRepository;
        this.cityRepository = cityRepository;
        this.countryRepository = countryRepository;
        this.provinceRepository = provinceRepository;
    }

    @Transactional
    public AddressDTO createAddress(String l1, String l2, String streetName, String cityName, String provinceName, String countryName) {
        CityEntity city = new CityEntity(null, cityName); 
        ProvinceEntity province = new ProvinceEntity(null, provinceName);
        CountryEntity country = new CountryEntity(null, countryName);

        Optional<CityEntity> optionalCity = cityRepository.findOne(Example.of(city));
        if(optionalCity.isPresent()) {
            city = optionalCity.get();
        }
        else {
            city = cityRepository.save(city);
        }

        Optional<ProvinceEntity> optionalProvince = provinceRepository.findOne(Example.of(province));
        if(optionalProvince.isPresent()) {
            province = optionalProvince.get();
        }
        else {
            province = provinceRepository.save(province);
        }

        Optional<CountryEntity> optionalCountry = countryRepository.findOne(Example.of(country));
        if(optionalCountry.isPresent()) {
            country = optionalCountry.get();
        }
        else {
            country = countryRepository.save(country);
        }
        
        AddressEntity newAddress = new AddressEntity(null, l1, l2, streetName, city, province, country);
        Optional<AddressEntity> optionalNewAddress = addressRepository.findOne(Example.of(newAddress));
        if(optionalNewAddress.isPresent()) {
            newAddress = optionalNewAddress.get();
        }
        else {
            newAddress = addressRepository.save(newAddress);
        }

        return AddressMapper.INSTANCE.entityToDto(newAddress);
    }
} 
