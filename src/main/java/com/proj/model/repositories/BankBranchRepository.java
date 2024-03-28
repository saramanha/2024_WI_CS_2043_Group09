package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.BankBranchEntity;

@Repository
public interface BankBranchRepository extends JpaRepository<BankBranchEntity, Long>{

}
