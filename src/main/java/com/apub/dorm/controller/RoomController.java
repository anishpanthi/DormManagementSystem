package com.apub.dorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Room;
import com.apub.dorm.service.BuildingService;
import com.apub.dorm.service.RoomService;

@Controller
@RequestMapping("auth/admin/room")
public class RoomController {
	@Autowired
	private BuildingService buildingService;
	@Autowired
	private RoomService roomService;
	
	@RequestMapping
	public String getAssignmentForm(Model model) {
		model.addAttribute("room", new Room());
		model.addAttribute("itemList", roomService.getAllItems());
		return "room/room";

	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String createRoom(@ModelAttribute("room") Room room, BindingResult result, RedirectAttributes flashAttributes){
		if(!result.hasErrors()){
			//System.out.println(room);
			System.out.println("doing good");
			roomService.create(room);
			flashAttributes.addFlashAttribute("successMessage", "Room successfully created");
			return "redirect:/auth/admin/room";
		}else{
			System.out.println("doing not good");
			System.out.println(room);
			roomService.create(room);
			
		return "redirect:/auth/admin/room";
		}
	}
}
