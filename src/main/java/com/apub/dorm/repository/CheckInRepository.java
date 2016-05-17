package com.apub.dorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.CheckInForm;

public interface CheckInRepository extends JpaRepository<CheckInForm, Integer>{
	
}
