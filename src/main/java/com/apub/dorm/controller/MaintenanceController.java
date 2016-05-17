package com.apub.dorm.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Student;
import com.apub.dorm.service.MaintenanceService;
import com.apub.dorm.service.StudentService;

@Controller
//@RequestMapping("auth/staff/maintenance/edit")
public class MaintenanceController {
	//storing the constant path

	private final String STUDENT_PATH = "auth/student/maintenance";
	private final String STAFF_PATH = "auth/staff/maintenance";
	
	
	@Autowired
	private MaintenanceService maintenanceService;
	
	@Autowired
	private StudentService studentService;
	
	private Student loggedInStudent;
	
	@RequestMapping(value=STUDENT_PATH,method=RequestMethod.GET)
	public String index(Model model, Principal principal){
		loggedInStudent  = studentService.findByUsername(principal.getName());
		Maintenance maintenance = new Maintenance();
		maintenance.setStudent(loggedInStudent);
		model.addAttribute("maintenance", maintenance);
		model.addAttribute("student",loggedInStudent);
		return "maintenance/index";
	}
	
	@RequestMapping(value=STUDENT_PATH,method=RequestMethod.POST)
	public String registerMaintenance(Maintenance maintenance, 
			RedirectAttributes redirectAttributes,
			Model model){
		redirectAttributes.addFlashAttribute("postMessage", "Thanks. Your maintenance request is saved successfuly");
		maintenance.setStudent(loggedInStudent);
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
	public String updateMaintenanceRequest(@PathVariable("id") int id, Maintenance maintenance,BindingResult result,RedirectAttributes redirectAttributes){
		Maintenance newMaintenance = maintenanceService.findOne(id);
		newMaintenance.setStatus(maintenance.getStatus());
		System.out.println(maintenance.getStatus());
		maintenanceService.update(newMaintenance,id);
		redirectAttributes.addFlashAttribute("postMessage", "Maintenance request was updated successfuly");
		return "redirect:/"+STAFF_PATH;
	}
}
