package com.apub.dorm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.Building;

public interface BuildingRepository extends JpaRepository<Building, Serializable> {
	
}
