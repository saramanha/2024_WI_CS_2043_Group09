package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.CityEntity;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long>{

}
