package com.apub.dorm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apub.dorm.domain.Item;
import com.apub.dorm.domain.Room;
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

	@Override
	public void create(Room room) {
		List<Item> tempItemList = new ArrayList<>();
		for(int id: room.getItemIds()){
			tempItemList.add(itemRepository.findById(id));
			System.out.println(itemRepository.findById(id));
		}
		room.setItems(tempItemList);
		System.out.println(room);
		roomRepository.save(room);
	}

	@Override
	public List<Room> findRoomNumbersByBuildingNo(int buildingNumber) {
		/*List<Room> result = new ArrayList<>();
		for(Room room : roomRepository.findAll()) {
			if(room.getBuildingNo() == buildingNumber) result.add(room);
		}*/
		
		return null;
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

}
