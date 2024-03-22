package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.CredentialEntity;

public interface CredentialRepository extends JpaRepository <CredentialEntity, AgentInformationEntity>{

}
