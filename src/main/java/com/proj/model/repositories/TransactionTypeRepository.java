package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.TransactionTypeEntity;

@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionTypeEntity, Long>{

}
