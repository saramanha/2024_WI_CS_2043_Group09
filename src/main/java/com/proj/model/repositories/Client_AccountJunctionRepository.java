package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.embeddables.Client_AccountJunctionId;
import com.proj.model.entities.Client_AccountJunctionEntity;

public interface Client_AccountJunctionRepository extends JpaRepository<Client_AccountJunctionEntity, Client_AccountJunctionId>{

}
