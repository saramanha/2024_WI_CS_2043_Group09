package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.DocumentEntity;

public interface DocumentRepository extends JpaRepository<DocumentEntity, Long>{

}
