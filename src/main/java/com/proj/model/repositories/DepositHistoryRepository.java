package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.DepositHistoryEntity;

public interface DepositHistoryRepository extends JpaRepository<DepositHistoryEntity, Long>{
    List<DepositHistoryEntity> findAllByAgentId(Long agentId);
    List<DepositHistoryEntity> findAllByAccountInformationId(Long accountInformationId);
}
