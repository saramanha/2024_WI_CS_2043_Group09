package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.BankBranchEntity;

public interface BankBranchRepository extends JpaRepository<BankBranchEntity, Long>{

}
