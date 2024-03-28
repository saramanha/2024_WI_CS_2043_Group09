package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.DepositHistoryEntity;

@Repository
public interface DepositHistoryRepository extends JpaRepository<DepositHistoryEntity, Long>{
    List<DepositHistoryEntity> findAllByAgentId(Long agentId);
    List<DepositHistoryEntity> findAllByAccountInformationId(Long accountInformationId);
}
