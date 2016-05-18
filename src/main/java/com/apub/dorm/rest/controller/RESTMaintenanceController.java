package com.apub.dorm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.service.MaintenanceService;;

@RestController
@RequestMapping("/api/maintenance")
public class RESTMaintenanceController {
	
	@Autowired private MaintenanceService service;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Maintenance> getAllMaintenance(){
			return service.findAll();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id){
			 service.delete(id);
	}
	
}
