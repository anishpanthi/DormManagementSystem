package com.apub.dorm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Building;
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
	public String getBuilding(Building building, Model model) {
		model.addAttribute("roomList", roomService.getAllRooms());
		if (building != null) {
			model.addAttribute("building", building);
			if (building.getId() != null)
				model.addAttribute("roomsByBuilding", buildingService.findRoomByBuildingId(building.getId()));
		} else {
			model.addAttribute("building", new Building());
		}

		return "building/building";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String createForm(@ModelAttribute("building") @Valid Building building, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (!result.hasErrors()) {
			buildingService.create(building);
			redirectAttributes.addFlashAttribute("successMessage", "Building Created Successfully");
		}
		return "redirect:/auth/admin/building";
	}

	/********************* Update Maintenance Request By ID **********/
	// ------------------POST REQUEST ---------------------//
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String updateBuilding(@PathVariable Integer id, Building building, Model model) {
		buildingService.update(building, id);
		return "redirect:/auth/admin/building"; // PRG Pattern

	}

	/********************* Update Building Request By ID **********/
	// ------------------GET REQUEST ---------------------//
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String updateBuildingForm(@PathVariable Integer id, Model model) {
		return getBuilding(buildingService.findOne(id), model);

	}
}
