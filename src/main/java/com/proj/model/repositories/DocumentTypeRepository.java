package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.DocumentTypeEntity;

public interface DocumentTypeRepository extends JpaRepository<DocumentTypeEntity, Long>{

}
