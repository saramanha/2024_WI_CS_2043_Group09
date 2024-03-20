package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

}
