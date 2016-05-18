package com.apub.dorm.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apub.dorm.domain.CheckInForm;
import com.apub.dorm.domain.CheckInFormData;
import com.apub.dorm.domain.CheckOutForm;
import com.apub.dorm.domain.CheckOutFormData;
import com.apub.dorm.domain.Student;
import com.apub.dorm.service.CheckInService;
import com.apub.dorm.service.CheckOutService;
import com.apub.dorm.service.ItemService;
import com.apub.dorm.service.StudentService;

@Controller
@RequestMapping(value = "/auth/admin/form")
public class FormController {

	@Autowired
	private CheckInService checkInService;

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private CheckOutService checkOutService;
	
	@Autowired
	private StudentService studentService;
	
	private Student loggedInStudent;

	@RequestMapping(value = "/checkinForm", method = RequestMethod.GET)
	public String loadCheckInForm(Model model, Principal principal, HttpServletRequest request) {
		loggedInStudent  = studentService.findByUsername(principal.getName());
		
		request.getSession().setAttribute("loggedInStudent", loggedInStudent);
		
		model.addAttribute("checkinFormItems", itemService.findAll());
		model.addAttribute("checkInFormData", new CheckInFormData());

		return "form/checkinForm";
	}

	@RequestMapping(value = "/checkinForm", method = RequestMethod.POST)
	public String saveCheckInForm(@ModelAttribute("checkInFormData") CheckInFormData checkInFormData,
			BindingResult result, HttpServletRequest request) {
		Integer[] idCheckedItem = checkInFormData.getId();
		String[] nameCheckedItem = checkInFormData.getItemName();
		String[] descriptionCheckedItem = checkInFormData.getDescription();
		String[] statusCheckedItem = checkInFormData.getStatus();
		Boolean[] checkedItems = checkInFormData.getAvailable();
		boolean flag = true;
		for (int i = 0; i < idCheckedItem.length; i++) {
			if (checkedItems[i]) {
				CheckInForm checkInForm = new CheckInForm();
				checkInForm.setId(idCheckedItem[i]);
				checkInForm.setItemName(nameCheckedItem[i]);
				checkInForm.setDescription(descriptionCheckedItem[i]);
				checkInForm.setStatus(statusCheckedItem[i]);
				checkInForm.setAvailable(checkedItems[i]);
				
				checkInForm.setStudent(loggedInStudent);
				
				checkInService.create(checkInForm);
				flag=false;
			}
		}
		
		if(flag){
			System.out.println("No Item Selected. CheckIn Form is Empty.");
		}
		
		return "redirect:/auth/admin";
	}
	
	@RequestMapping(value="/checkoutForm", method=RequestMethod.GET)
	public String loadCheckOutForm(Model model, Principal principal, HttpServletRequest request) {
		
		loggedInStudent  = studentService.findByUsername(principal.getName());
		
		request.getSession().setAttribute("loggedInStudent", loggedInStudent);
		
		model.addAttribute("checkInFormItems", checkInService.findByStudent(loggedInStudent));
		model.addAttribute("checkOutFormData", new CheckOutFormData());

		return "form/checkoutForm";
	}
	
	@RequestMapping(value = "/checkoutForm", method = RequestMethod.POST)
	public String saveCheckOutForm(@ModelAttribute("checkOutFormData") CheckOutFormData checkOutFormData,
			BindingResult result, HttpServletRequest request) {
		Integer[] idCheckedItem = checkOutFormData.getId();
		String[] nameCheckedItem = checkOutFormData.getItemName();
		String[] descriptionCheckedItem = checkOutFormData.getDescription();
		String[] previousStatusCheckedItem = checkOutFormData.getPreviousStatus();
		String[] currentStatusCheckedItems = checkOutFormData.getCurrentStatus();
		for (int i = 0; i < idCheckedItem.length; i++) {
				CheckOutForm checkOutForm = new CheckOutForm();
				checkOutForm.setId(idCheckedItem[i]);
				checkOutForm.setItemName(nameCheckedItem[i]);
				checkOutForm.setDescription(descriptionCheckedItem[i]);
				checkOutForm.setPreviousStatus(previousStatusCheckedItem[i]);
				checkOutForm.setCurrentStatus(currentStatusCheckedItems[i]);
				
				Student loggedInStudent = (Student)request.getSession().getAttribute("loggedInStudent");
				System.out.println(loggedInStudent.getFirstName());
				checkOutForm.setStudent(loggedInStudent);
				
				checkOutService.create(checkOutForm);
		}
		
		return "redirect:/auth/admin";
	}
}
