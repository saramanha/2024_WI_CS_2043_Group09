package com.proj.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.model.entities.FeedbackEntity;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long>{

}
