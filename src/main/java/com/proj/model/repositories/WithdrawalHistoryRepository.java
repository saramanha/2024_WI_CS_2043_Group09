package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.WithdrawalHistoryEntity;

@Repository
public interface WithdrawalHistoryRepository extends JpaRepository<WithdrawalHistoryEntity, Long>{
    List<WithdrawalHistoryEntity> findAllByAgentId(Long agentId);
    List<WithdrawalHistoryEntity> findAllByAccountInformationId(Long accountInformationId);
}
