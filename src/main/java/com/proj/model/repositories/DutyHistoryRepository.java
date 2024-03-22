package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.DutyHistoryEntity;

public interface DutyHistoryRepository extends JpaRepository<DutyHistoryEntity, Long>{

}
