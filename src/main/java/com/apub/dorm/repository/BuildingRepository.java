package com.apub.dorm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;

import java.lang.String;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
//	@Query("FROM Building WHERE buildingNo=:buildingNumber")
	public Building findByBuildingNo(int buildingNumber);
}
