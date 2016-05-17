package com.apub.dorm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auth/student/room")
public class RoomManagementController {
	
	@RequestMapping(value="/roomChangeRequest", method = RequestMethod.GET)
	public String roomChangeRequest(Model model) {
		//model.addAttribute("roomManagement");
		return "room/roomChangeRequest";
	}
	@RequestMapping(value="/roomChangeRequest", method = RequestMethod.POST)
	public String processRoomChangeRequest(BindingResult result, Model model) {
		if (!result.hasErrors()) {
			
		}
		return "redirect:/auth/student/";
	}
}
