package com.proj.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.AgentInformationEntity;

@Repository
public interface AgentInformationRepository extends JpaRepository<AgentInformationEntity, Long>{
    public List<AgentInformationEntity> findAllByLastName(String lastName);
}
