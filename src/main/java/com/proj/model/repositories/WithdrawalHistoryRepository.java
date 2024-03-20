package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.WithdrawalHistoryEntity;

public interface WithdrawalHistoryRepository extends JpaRepository<WithdrawalHistoryEntity, Long>{

}
