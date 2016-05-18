package com.apub.dorm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.Building;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
	List<Building> findAll();
}
