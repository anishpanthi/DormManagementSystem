package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apub.dorm.domain.Room;
import com.apub.dorm.service.RoomService;

@RestController
@RequestMapping("/api/room")
public class RESTRoomController {

	@Autowired
	private RoomService roomService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Room> getRooms() {
		return roomService.getAllRooms();
	}
	
	/***********GET ROOMS FROM Buildings *************/
	@RequestMapping(value = "/all/{id}", method = RequestMethod.GET)
	public List<Room> getBuildingRooms(@PathVariable Integer id) {
		return roomService.findRoomNumbersByBuildingNo(id);
	}


	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		roomService.delete(id);
	}

}
