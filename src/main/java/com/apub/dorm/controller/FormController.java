package com.apub.dorm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apub.dorm.domain.CheckInForm;
import com.apub.dorm.domain.CheckInFormData;
import com.apub.dorm.service.CheckInService;
import com.apub.dorm.service.ItemService;

@Controller
@RequestMapping(value = "/auth/admin/form")
public class FormController {

	@Autowired
	private CheckInService checkInService;

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/checkinForm", method = RequestMethod.GET)
	public String loadCheckInForm(Model model, HttpServletRequest request) {
		model.addAttribute("checkinFormItems", itemService.findAll());
//		request.getSession().setAttribute("checkinFormItems", itemService.findAll());
		return "form/checkinForm";
	}

	@RequestMapping(value = "/checkinForm", method = RequestMethod.POST)
	public String saveCheckInForm(CheckInFormData checkInFormData, BindingResult result, HttpServletRequest request) {
		List<Integer> idCheckedItem = checkInFormData.getId();
		List<String> nameCheckedItem = checkInFormData.getItemName();
		List<String> descriptionCheckedItem = checkInFormData.getDescription();
		List<String> statusCheckedItem = checkInFormData.getStatus();
		List<Boolean> checkedItems = checkInFormData.getAvailable();
		System.out.println(checkedItems);
		for (int i = 0; i < checkedItems.size(); i++) {
			System.out.println(checkedItems.get(i));
			if(checkedItems.get(i)){
				CheckInForm checkInForm = new CheckInForm();
				checkInForm.setId(idCheckedItem.get(i));
				checkInForm.setItemName(nameCheckedItem.get(i));
				checkInForm.setDescription(descriptionCheckedItem.get(i));
				checkInForm.setStatus(statusCheckedItem.get(i));
				checkInForm.setAvailable(checkedItems.get(i));
				checkInService.create(checkInForm);
			}
		}
		
		request.getSession().setAttribute("checkinFormItems", itemService.findAll());

		return "redirect:/auth/admin/form/checkinForm";
	}

}
