package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.embeddables.Client_AccountJunctionId;
import com.proj.model.entities.Client_AccountJunctionEntity;
// TODO: test
public interface Client_AccountJunctionRepository extends JpaRepository<Client_AccountJunctionEntity, Client_AccountJunctionId>{
    List<Client_AccountJunctionEntity> findAllByAgentId(Long agentId);
    List<Client_AccountJunctionEntity> findAllByAccountId(Long accountId);
}
