package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.CurrencyEntity;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long>{

}
