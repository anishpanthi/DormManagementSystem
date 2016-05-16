package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apub.dorm.domain.Room;
import com.apub.dorm.service.RoomService;

@Controller
@RequestMapping("auth/admin/api/room")
public class RESTRoomController {
	@Autowired
	private RoomService roomService;

	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public @ResponseBody List<Room> roomsForBuilding(@RequestParam(value = "buildingNo", required = true) int buildingNo) {
		System.err.println(roomService.findRoomNumbersByBuildingNo(buildingNo));
		return roomService.findRoomNumbersByBuildingNo(buildingNo);
	}
}
