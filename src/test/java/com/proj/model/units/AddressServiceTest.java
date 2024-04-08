package com.proj.model.units;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.controller.Main;
import com.proj.model.dtos.AddressDTO;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.services.AddressService;

@SpringBootTest(classes = Main.class)
public class AddressServiceTest {
    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void insertionTest() {
        AddressDTO addressDTO = addressService.createAddress("l1", "l2", "street name", "city name", "province name", "country name");
        assertNotNull(addressRepository.findById(addressDTO.getId()).get());
    }
}
