package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apub.dorm.domain.Building;

@RestController
@RequestMapping("auth/admin/api/building")
public class RESTBuildingController {

	
//	TODO
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Building> getStudentsInBuilding(@RequestParam(value = "buildingId", required = true) int buildingId) {
		// return buildingService.getBuildingFromStudentId(studentId);
		return null;
	}
}
