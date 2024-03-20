package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.DepositHistoryEntity;

public interface DepositHistoryRepository extends JpaRepository<DepositHistoryEntity, Long>{

}
