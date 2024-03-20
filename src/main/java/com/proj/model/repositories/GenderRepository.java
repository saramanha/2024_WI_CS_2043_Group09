package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.GenderEntity;

public interface GenderRepository extends JpaRepository<GenderEntity, Long>{

}
