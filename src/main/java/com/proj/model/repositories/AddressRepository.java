package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.CityEntity;
import com.proj.model.entities.CountryEntity;
import com.proj.model.entities.ProvinceEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long>{
    public List<AddressEntity> findAllByStreetName(String streetName);
    public List<AddressEntity> findAllByCity(CityEntity city);
    public List<AddressEntity> findAllByProvince(ProvinceEntity province);
    public List<AddressEntity> findAllByCountry(CountryEntity country);
}
