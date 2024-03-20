package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.AccountInformationEntity;

public interface AccountInformationRepository extends JpaRepository<AccountInformationEntity, Long> {
    
}
