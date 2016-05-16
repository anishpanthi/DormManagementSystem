package com.apub.dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Item;
import com.apub.dorm.service.ItemService;

@Controller
@RequestMapping(value="/auth/admin/")
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping(value="item", method=RequestMethod.GET)
	public String loadItemForm(Model model){
		model.addAttribute("item",new Item());
		return "item/index";
	}
	
	@RequestMapping(value="item", method=RequestMethod.POST)
	public String reLoadItemForm(@ModelAttribute("item") Item newItem, BindingResult resultFeedback, RedirectAttributes redirectAttributes){
		itemService.create(newItem);
		redirectAttributes.addFlashAttribute("itemPostMessage", "One Item Added.");
		return "redirect:/auth/admin/item";
	}
}
