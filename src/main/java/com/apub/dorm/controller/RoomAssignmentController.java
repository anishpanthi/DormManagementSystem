package com.apub.dorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apub.dorm.service.BuildingService;
import com.apub.dorm.service.RoomService;

@Controller
@RequestMapping("auth/admin/roomassignment")
public class RoomAssignmentController {
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private RoomService roomService;


	@RequestMapping
	public String getAssignmentForm(Model model) {
		model.addAttribute("buildings", buildingService.getBuildings());
		return "room/roomAssignment";
	}
}
