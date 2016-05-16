package com.apub.dorm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.service.MaintenanceService;

@Controller
//@RequestMapping("")
public class MaintenanceController {
	//storing the constant path

	private final String STUDENT_PATH = "auth/student/maintenance";
	private final String STAFF_PATH = "auth/staff/maintenance";
	
	
	@Autowired
	private MaintenanceService maintenanceService;
	
	@RequestMapping(value=STUDENT_PATH,method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("maintenance", new Maintenance());
		return   "maintenance/index";
	}
	
	@RequestMapping(value=STUDENT_PATH,method=RequestMethod.POST)
	public String registerMaintenance(@Valid Maintenance maintenance, 
			RedirectAttributes redirectAttributes,BindingResult bindingResult,
			Model model){
		if(bindingResult.hasErrors()){
			
		}
		redirectAttributes.addFlashAttribute("postMessage", "Thanks. Your maintenance request is saved successfuly");
		maintenanceService.create(maintenance);
		return "redirect:/"+STUDENT_PATH; //PRG Pattern
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value=STAFF_PATH,method=RequestMethod.GET)
	public String getAllMaintenanceRequest(Model model){
		model.addAttribute("maintenances",maintenanceService.findAll());
		return "maintenance/list";
	}
	
	@RequestMapping(value=STAFF_PATH +"/{id}", method=RequestMethod.GET)
	public String viewMaintenanceRequest(@PathVariable("id") Integer id, Model model){
		model.addAttribute("maintenance", maintenanceService.findOne(id));
		
		return "maintenance/update";
	}
	
}
