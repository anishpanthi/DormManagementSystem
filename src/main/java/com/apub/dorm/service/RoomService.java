package com.apub.dorm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Item;
import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Room;
import com.apub.dorm.domain.RoomInfo;

@Service
public interface RoomService {

	public void create(Room room);
	
	public List<Room> findRoomNumbersByBuildingNo(int buildingNumber);

	public List<Item> getAllItems();
	
	public List<Room> getAllRooms();
	
	public List<RoomInfo> findAll();

}
