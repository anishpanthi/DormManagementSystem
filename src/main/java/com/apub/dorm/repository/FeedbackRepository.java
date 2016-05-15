package com.apub.dorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
	
}
