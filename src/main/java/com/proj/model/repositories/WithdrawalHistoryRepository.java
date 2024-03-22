package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.WithdrawalHistoryEntity;

public interface WithdrawalHistoryRepository extends JpaRepository<WithdrawalHistoryEntity, Long>{
    List<WithdrawalHistoryEntity> findAllByAgentId(Long agentId);
    List<WithdrawalHistoryEntity> findAllByAccountInformationId(Long accountInformationId);
}
