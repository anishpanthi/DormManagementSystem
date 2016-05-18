package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apub.dorm.domain.Building;
import com.apub.dorm.service.BuildingService;

@RestController
@RequestMapping("/api/building")
public class RESTBuildingController {

	
@Autowired private BuildingService buildingService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Building> getAll(){
			return buildingService.getBuildings();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id){
		buildingService.delete(id);
	}
}
