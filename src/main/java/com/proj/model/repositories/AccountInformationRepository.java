package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.AccountInformationEntity;

@Repository
public interface AccountInformationRepository extends JpaRepository<AccountInformationEntity, Long> {
    
}
