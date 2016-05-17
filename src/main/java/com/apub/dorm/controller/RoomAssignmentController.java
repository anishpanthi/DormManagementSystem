package com.apub.dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.RoomAssignment;
import com.apub.dorm.service.BuildingService;
import com.apub.dorm.service.RoomAssignmentService;

@Controller
@RequestMapping("auth/admin/roomassignment")
public class RoomAssignmentController {
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private RoomAssignmentService roomAssignmentService;

	@RequestMapping
	public String getAssignmentForm(Model model) {
		model.addAttribute("buildings", buildingService.getBuildings());
		model.addAttribute("roomAssignment", new RoomAssignment());
		return "room/roomAssignment";
	}

	@RequestMapping(value = "/assign", method = RequestMethod.POST)
	public String assignForm(@ModelAttribute("roomAssignment") RoomAssignment roomAssignment, BindingResult result,
			RedirectAttributes redirectAttributes, Model model) {
		redirectAttributes.addFlashAttribute("successMessage", "Room is Successfully assigned");
		roomAssignmentService.create(roomAssignment);
		return "redirect:/auth/admin/roomassignment";
	}
}
