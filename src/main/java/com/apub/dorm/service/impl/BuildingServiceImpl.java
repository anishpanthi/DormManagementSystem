package com.apub.dorm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;
import com.apub.dorm.repository.BuildingRepository;
import com.apub.dorm.repository.RoomRepository;
import com.apub.dorm.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public void create(Building building) {
		List<Room> roomList = new ArrayList<>();
		Room aRoom = null;
		for (int id : building.getRoomIds()) {
			aRoom = roomRepository.findById(id);
			aRoom.setBuilding(building);
			roomList.add(aRoom);
		}

		building.setRooms(roomList);
		buildingRepository.save(building);
	}

	@Override
	public List<Building> getBuildings() {
		return buildingRepository.findAll();
	
	}

	@Override
	public Building findOne(Integer id) {
		return buildingRepository.findOne(id);
	}

	@Override
	public void delete(Integer id) {
		buildingRepository.delete(id);
	}

	@Override
	public void update(Building building, int id) {
		building.setId(id);
		buildingRepository.save(building);

	}
	
	
	/*@Override
	public List<Room> findRoomByBuilding(Building building) {
		return roomRepository.findRoomByBuilding(building);
	}*/
	
	@Override
	public List<Room> findRoomByBuildingId(Integer buildingId) {
		return roomRepository.findRoomByBuildingId(buildingId);
	}

}
