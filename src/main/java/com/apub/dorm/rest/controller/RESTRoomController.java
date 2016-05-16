package com.apub.dorm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;
import com.apub.dorm.service.BuildingService;
import com.apub.dorm.service.RoomService;

@Controller
@RequestMapping("auth/admin/api/room")
public class RESTRoomController {
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value = "/roomform", method = RequestMethod.GET)
	public String getAssignmentForm(Model model) {
		model.addAttribute("buildings", buildingService.getBuildings());
		return "room/room";

	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String createRoom(@ModelAttribute Room room, RedirectAttributes flashAttributes){
		roomService.create(room);
		flashAttributes.addAttribute("success", "Room Created Successfully");
		return "room/room";
	}
}
