package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apub.dorm.domain.RoomInfo;
import com.apub.dorm.service.RoomService;

@RestController
@RequestMapping("/api/room")
public class RESTRoomController {
	
	@Autowired private RoomService roomService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<RoomInfo> getRooms(){
			return roomService.findAll();
	}

}
