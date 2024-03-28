package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.TransactionStatusEntity;

@Repository
public interface TransactionStatusRepository extends JpaRepository<TransactionStatusEntity, Long>{

}
