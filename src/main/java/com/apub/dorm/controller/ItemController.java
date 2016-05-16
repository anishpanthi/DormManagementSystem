package com.apub.dorm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String loadItemForm(Model model, HttpServletRequest request){
		model.addAttribute("item",new Item());
		request.getSession().setAttribute("items", itemService.findAll());
		return "item/index";
	}
	
	@RequestMapping(value="item", method=RequestMethod.POST)
	public String reLoadItemForm(@ModelAttribute("item") Item newItem, BindingResult result, 
			RedirectAttributes redirectAttributes, HttpServletRequest request){
		itemService.create(newItem);
		redirectAttributes.addFlashAttribute("itemPostMessage", "One Item Added.");
		request.getSession().setAttribute("items", itemService.findAll());
		return "redirect:/auth/admin/item";
	}
	
	@RequestMapping(value="item/listItems", method = RequestMethod.GET)
	public String listAllItems(Model model){
		model.addAttribute("items", itemService.findAll());
		return "item/listItems";
	}
	
	@RequestMapping(value="item/listItems/edit/{id}", method=RequestMethod.GET)
	public String loadEditItemForm(@PathVariable("id") int id, Model model){
		model.addAttribute("item", itemService.findOne(id));
		return "item/index";
	}
	
	@RequestMapping(value="item/listItems/edit/{id}", method=RequestMethod.POST)
	public String doneEditingItemForm(@PathVariable("id") int id, @ModelAttribute("item") Item updateItem, 
			BindingResult result, HttpServletRequest request){
		itemService.update(updateItem, id);
		return "redirect:/auth/admin/item/listItems";
	}
	
	@RequestMapping(value="item/listItems/delete/{id}", method=RequestMethod.GET)
	public String deleteItem(@PathVariable("id") int id, HttpServletRequest request, Model model){
		itemService.delete(itemService.findOne(id));
		return "redirect:/auth/admin/item/listItems";
	}
}
