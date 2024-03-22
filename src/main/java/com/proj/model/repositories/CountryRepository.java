package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, Long>{

}
