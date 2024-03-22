package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.AgentInformationEntity;

public interface AgentInformationRepository extends JpaRepository<AgentInformationEntity, Long>{

}
