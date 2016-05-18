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
import com.apub.dorm.domain.Student;
import com.apub.dorm.service.BuildingService;
import com.apub.dorm.service.RoomAssignmentService;
import com.apub.dorm.service.RoomService;
import com.apub.dorm.service.StudentService;

@Controller
@RequestMapping("auth/admin/student")
public class StudentController{
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getAssignmentForm(Model model) {
		System.out.println(buildingService.getBuildings().toString());
		model.addAttribute("buildings", buildingService.getBuildings());
		model.addAttribute("student", new Student());
		return "student/student";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String assignForm(@ModelAttribute("student") Student student, BindingResult result, Model model) {
		//redirectAttributes.addFlashAttribute("successMessage", "Student created successfully");
		studentService.create(student);
		return "redirect:/auth/admin/student/create";
	}
}
