package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.embeddables.CurrencyConversionId;
import com.proj.model.entities.CurrencyConversionEntity;

@Repository
public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversionEntity, CurrencyConversionId>{

}
