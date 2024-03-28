package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.DutyHistoryEntity;

@Repository
public interface DutyHistoryRepository extends JpaRepository<DutyHistoryEntity, Long>{

}
