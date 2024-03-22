package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.AccountTypeEntity;

public interface AccountTypeRepository extends JpaRepository<AccountTypeEntity, Long>{

}
