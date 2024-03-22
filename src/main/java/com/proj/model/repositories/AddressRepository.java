package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long>{

}
