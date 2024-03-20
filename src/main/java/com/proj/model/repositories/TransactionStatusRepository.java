package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.TransactionStatusEntity;

public interface TransactionStatusRepository extends JpaRepository<TransactionStatusEntity, Long>{

}
