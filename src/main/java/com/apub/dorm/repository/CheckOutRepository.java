package com.apub.dorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.CheckOutForm;

public interface CheckOutRepository extends JpaRepository<CheckOutForm, Integer>{
	
}
