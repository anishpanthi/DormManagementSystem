package com.apub.dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;
import com.apub.dorm.service.BuildingService;
import com.apub.dorm.service.RoomService;

@Controller
@RequestMapping("auth/admin/building")
public class BuildingInfoController {
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private RoomService roomService;

	@RequestMapping
	public String getAssignmentForm(Model model) {
		model.addAttribute("roomList", roomService.getAllRooms());
		model.addAttribute("building", new Building());
		
		return "building/building";

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createForm(@ModelAttribute("building") Building building, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (!result.hasErrors()) {
			buildingService.create(building);
			redirectAttributes.addFlashAttribute("successMessage", "Building Created Successfully");
		}
		return "redirect:/auth/admin/building";
	}
}
