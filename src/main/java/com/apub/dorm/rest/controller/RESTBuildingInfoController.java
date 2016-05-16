package com.apub.dorm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apub.dorm.domain.Building;
import com.apub.dorm.service.BuildingService;

@Controller
@RequestMapping("auth/admin/api/building")
public class RESTBuildingInfoController {
	@Autowired
	private BuildingService buildingService;
	
	@RequestMapping(value = "/buildingform", method = RequestMethod.GET)
	public String getAssignmentForm() {
		return "building/building";

	}
	
	@RequestMapping(value="/createform", method = RequestMethod.POST)
	public String createForm(@ModelAttribute Building building, Model model){
		buildingService.create(building);
		model.addAttribute("success", "Building Created Successfully");
		return "building/building";
	}
}
