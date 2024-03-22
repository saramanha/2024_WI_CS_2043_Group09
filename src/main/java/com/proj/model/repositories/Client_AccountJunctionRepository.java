package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proj.model.embeddables.Client_AccountJunctionId;
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.Client_AccountJunctionEntity;
// TODO: test
public interface Client_AccountJunctionRepository extends JpaRepository<Client_AccountJunctionEntity, Client_AccountJunctionId>{
    List<Client_AccountJunctionEntity> findAllByAgentId(Long agentId);
    List<Client_AccountJunctionEntity> findAllByAccountId(Long accountId);
    
    @Query("SELECT c.agent FROM Client_AccountJunctionEntity c WHERE c.agent.id = :agentId")
    List<AccountInformationEntity> findAllAccountsByAgentId(@Param("agentId") Long agentId);

    @Query("SELECT c.account FROM Client_AccountJunctionEntity c WHERE c.account.id = :accountId")
    List<AgentInformationEntity> findAllAgentsByAccountId(@Param("accountId") Long accountId);
}
