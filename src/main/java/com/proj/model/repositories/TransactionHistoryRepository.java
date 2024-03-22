package com.proj.model.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proj.model.embeddables.TransactionHistoryId;
import com.proj.model.entities.TransactionHistoryEntity;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistoryEntity, TransactionHistoryId>{
    @Query("SELECT t FROM TransactionHistoryEntity t WHERE t.deposit.agent.id = :agentId OR t.withdrawal.agent.id = :agentId")
    List<TransactionHistoryEntity> findAllByDepositAgentIdOrWithdrawalAgentId(@Param("agentId") Long agentId);

    @Query("SELECT t FROM TransactionHistoryEntity t WHERE t.deposit.accountInformation.id = :accountInformationId OR t.withdrawal.accountInformation.id = :accountInformationId")
    List<TransactionHistoryEntity> findAllByDepositAccountInformationIdOrWithdrawalAccountInformationId(@Param("accountInformationId") Long accountInformationId);
}
