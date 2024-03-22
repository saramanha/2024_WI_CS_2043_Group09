package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.CityEntity;

public interface CityRepository extends JpaRepository<CityEntity, Long>{

}
