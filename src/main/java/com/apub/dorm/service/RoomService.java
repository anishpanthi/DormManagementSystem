package com.apub.dorm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;

@Service
public interface RoomService {

	public void create(Room room);
	
	public List<Room> findRoomNumbersByBuildingNo(int buildingNumber);

}
