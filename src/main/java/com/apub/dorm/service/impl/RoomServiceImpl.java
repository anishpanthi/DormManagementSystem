package com.apub.dorm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;
import com.apub.dorm.repository.RoomRepository;
import com.apub.dorm.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public void create(Room room) {
		roomRepository.save(room);
	}

	@Override
	public List<Room> findRoomNumbersByBuildingNo(int buildingNumber) {
		List<Room> result = new ArrayList<>();
		for(Room room : roomRepository.findAll()) {
			if(room.getBuildingNo() == buildingNumber) result.add(room);
		}
		
		return result;
	}

}
