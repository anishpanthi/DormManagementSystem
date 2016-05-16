package com.apub.dorm.controller;

import java.security.Principal;

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

import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Student;
import com.apub.dorm.service.MaintenanceService;
import com.apub.dorm.service.StudentService;

@Controller
//@RequestMapping("")
public class MaintenanceController {
	//storing the constant path

	private final String STUDENT_PATH = "auth/student/maintenance";
	private final String STAFF_PATH = "auth/staff/maintenance";
	
	
	@Autowired
	private MaintenanceService maintenanceService;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value=STUDENT_PATH,method=RequestMethod.GET)
	public String index(Model model, Principal principal){
		model.addAttribute("maintenance", new Maintenance());
		model.addAttribute("student",studentService.findByUsername(principal.getName()));
		return   "maintenance/index";
	}
	
	@RequestMapping(value=STUDENT_PATH,method=RequestMethod.POST)
	public String registerMaintenance(@Valid Maintenance maintenance, 
			RedirectAttributes redirectAttributes,BindingResult bindingResult,
			Model model){
		if(bindingResult.hasErrors()){
			return "maintenance/index";
		}
		redirectAttributes.addFlashAttribute("postMessage", "Thanks. Your maintenance request is saved successfuly");
		maintenanceService.create(maintenance);
		return "redirect:/auth/student"; //PRG Pattern
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
	
	@RequestMapping(value=STAFF_PATH +"/edit/{id}", method=RequestMethod.GET)
	public String viewMaintenanceRequest(@PathVariable("id") Integer id, Model model){
		model.addAttribute("maintenance", maintenanceService.findOne(id));
		
		return "maintenance/update";
	}
	
	@RequestMapping(value=STAFF_PATH +"/edit/{id}", method=RequestMethod.POST)
	public String updateMaintenanceRequest(@PathVariable("id") Integer id, @ModelAttribute("maintenance") Maintenance maintenance , 
			RedirectAttributes redirectAttributes,Model model){
		
		maintenanceService.update(maintenance, id);
		redirectAttributes.addFlashAttribute("postMessage", "Thanks. Your maintenance request is saved successfuly");
		return "maintenance/list";
	}
	
	
	
}
