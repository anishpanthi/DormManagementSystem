package com.apub.dorm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apub.dorm.domain.CheckInForm;
import com.apub.dorm.domain.CheckOutForm;
import com.apub.dorm.domain.Student;
import com.apub.dorm.service.CheckInService;
import com.apub.dorm.service.CheckOutService;
import com.apub.dorm.service.ItemService;
import com.apub.dorm.service.StudentService;

@Controller
@RequestMapping(value = "/auth/staff/")
public class StaffController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private CheckInService checkInService;
	
	@Autowired
	private CheckOutService checkOutService;

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "viewCheckIn", method = RequestMethod.GET)
	public String loadViewCheckIn(Model model) {
		List<Student> students = studentService.findByMatchingIdFromCheckInFormAndStudent();
		Map<Integer,List<CheckInForm>> checkInForms = new HashMap<>();
		Integer key = 0;
		for (Student s : students) {
			checkInForms.put(key++, checkInService.findByStudent(s));
		}
		
		System.out.println(checkInForms);

		model.addAttribute("checkInForms", checkInForms);
		model.addAttribute("studentsList", studentService.findByMatchingIdFromCheckInFormAndStudent());

		return "staff/viewCheckIn";
	}
	
	@RequestMapping(value = "viewCheckOut", method = RequestMethod.GET)
	public String loadViewCheckOut(Model model) {
		List<Student> students = studentService.findByMatchingIdFromCheckOutFormAndStudent();
		Map<Integer,List<CheckOutForm>> checkOutForms = new HashMap<>();
		Integer key = 0;
		for (Student s : students) {
			checkOutForms.put(key++, checkOutService.findByStudent(s));
		}
		
		System.out.println(checkOutForms);

		model.addAttribute("checkOutForms", checkOutForms);
		model.addAttribute("studentsList", studentService.findByMatchingIdFromCheckOutFormAndStudent());

		return "staff/viewCheckOut";
	}
	
	@RequestMapping(value="viewCheckIn/details/{id}", method=RequestMethod.GET)
	public String loadCheckInItemDetails(@PathVariable("id") int id, Model model){
		Student student = studentService.findOne(id);
		model.addAttribute("checkInItems", checkInService.findByStudent(student));
		return "staff/viewCheckOut/details";
	}

}
