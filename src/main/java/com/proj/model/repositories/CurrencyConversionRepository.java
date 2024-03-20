package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.embeddables.CurrencyConversionId;
import com.proj.model.entities.CurrencyConversionEntity;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversionEntity, CurrencyConversionId>{

}
