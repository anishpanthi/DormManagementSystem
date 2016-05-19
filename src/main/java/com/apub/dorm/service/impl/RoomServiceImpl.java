package com.apub.dorm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Item;
import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Room;
import com.apub.dorm.repository.BuildingRepository;
import com.apub.dorm.repository.ItemRepository;
import com.apub.dorm.repository.RoomRepository;
import com.apub.dorm.service.RoomService;

@Service
//@Transactional
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public void create(Room room) {
		List<Item> tempItemList = new ArrayList<>();
		for(int id: room.getItemIds()){
			tempItemList.add(itemRepository.findById(id));
		}
		room.setItems(tempItemList);
		roomRepository.save(room);
	}

	@Override
	public List<Room> findRoomNumbersByBuildingNo(int buildingNumber) {
		return roomRepository.findRoomNumbersByBuildingNo(buildingNumber);
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}
	
	@Override
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}
	
	@Override
	public Room findOne(Integer id) {
		return roomRepository.findOne(id);
	}
	
	@Override
	public void delete(int id) {
		roomRepository.delete(id);
		
	}
	
	@Override
	public void update(Room room, int id) {
		room.setId(id);
		room.setBuilding(room.getBuilding());
		roomRepository.save(room);

	}

}
