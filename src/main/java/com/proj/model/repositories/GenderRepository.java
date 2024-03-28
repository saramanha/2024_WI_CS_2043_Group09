package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.model.entities.GenderEntity;

@Repository
public interface GenderRepository extends JpaRepository<GenderEntity, Long>{

}
