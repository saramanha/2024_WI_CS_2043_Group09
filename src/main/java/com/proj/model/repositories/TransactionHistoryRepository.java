package com.proj.model.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.embeddables.TransactionHistoryId;
import com.proj.model.entities.TransactionHistoryEntity;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistoryEntity, TransactionHistoryId>{
    List<TransactionHistoryEntity> findAllByDepositAgentIdOrWithdrawalAgentId(Long agentId);
    List<TransactionHistoryEntity> findAllByDepositAccountInformationIdOrWithdrawalAccountInformationId(Long accountInformationId);
}
