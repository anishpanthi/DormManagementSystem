package com.apub.dorm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;

@Service
public interface BuildingService {
	public void create(Building building);

	public List<Building> getBuildings();

	public Building findOne(Integer id);

	public void delete(Integer id);

	public void update(Building building, int id);
	

//	List<Room> findRoomByBuilding(Building building);
//
	public List<Room> findRoomByBuildingId(Integer buildingId);
}
