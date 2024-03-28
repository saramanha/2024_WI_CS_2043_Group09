package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.CredentialEntity;

@Repository
public interface CredentialRepository extends JpaRepository <CredentialEntity, AgentInformationEntity>{

}
