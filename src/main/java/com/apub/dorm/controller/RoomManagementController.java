package com.apub.dorm.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apub.dorm.domain.Student;
import com.apub.dorm.service.StudentService;

@Controller
@RequestMapping("/auth/student/room")
public class RoomManagementController {
	
	@Autowired
	StudentService studentService;
	
	private Student loggedInStudent;
	
	@RequestMapping(value="/roomChangeRequest", method = RequestMethod.GET)
	public String roomChangeRequest(Model model, Principal principal) {
		loggedInStudent  = studentService.findByUsername(principal.getName());
		model.addAttribute("student", loggedInStudent);
		return "room/roomChangeRequest";
	}
	@RequestMapping(value="/roomChangeRequest", method = RequestMethod.POST)
	public String processRoomChangeRequest(BindingResult result, Model model) {
		if (!result.hasErrors()) {
			
		}
		return "redirect:/auth/student/";
	}
}
