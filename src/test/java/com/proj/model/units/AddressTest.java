package com.proj.model.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.controller.Main;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.CityEntity;
import com.proj.model.entities.CountryEntity;
import com.proj.model.entities.ProvinceEntity;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.ProvinceRepository;

@SpringBootTest(classes = Main.class)
public class AddressTest {
    @Autowired
    private AddressRepository addressRepo;

    @Autowired
    private CityRepository cityRepo;

    @Autowired
    private ProvinceRepository provinceRepo;

    @Autowired
    private CountryRepository countryRepo;

    @Test
    public void testInsertion() {
        CityEntity city = new CityEntity(null, "testInsertion city name");
        cityRepo.saveAndFlush(city);
        ProvinceEntity province = new ProvinceEntity(null, "testInsertion province name");
        provinceRepo.saveAndFlush(province);
        CountryEntity country = new CountryEntity(null, "testInsertion country name");
        countryRepo.saveAndFlush(country);
        
        AddressEntity insertedAddress = new AddressEntity(null, "123", "456", "testInsertion street name", city, province, country);
        
        insertedAddress = addressRepo.saveAndFlush(insertedAddress);
        
        Optional<AddressEntity> retrievedAddress = addressRepo.findById(insertedAddress.getId());

        assertNotNull(retrievedAddress.get(), "Failed to find address");
        assertEquals(insertedAddress, retrievedAddress.get(), "Inserted address is not equal to the retrieved address");
    }
}
