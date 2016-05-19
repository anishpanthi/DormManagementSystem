package com.apub.dorm.controller;

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

import com.apub.dorm.domain.Room;
import com.apub.dorm.service.RoomService;

@Controller
@RequestMapping("auth/admin/room")
public class RoomController {
	@Autowired
	private RoomService roomService;

	@RequestMapping
	public String getRoomForm(Room room, Model model) {
		if (room != null) {
			model.addAttribute("room", room);
			model.addAttribute("edit", "yes");
		} else {
			model.addAttribute("room", new Room());
		}
		model.addAttribute("itemList", roomService.getAllItems());
		return "room/room";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String createRoom(@ModelAttribute("room") @Valid Room room, BindingResult result,
			RedirectAttributes flashAttributes) {
		if (!result.hasErrors()) {
			roomService.create(room);
			flashAttributes.addFlashAttribute("successMessage", "Room successfully created");
		}
		return "redirect:/auth/admin/room";
	}

	/********************* Update Room Request By ID **********/
	// ------------------POST REQUEST ---------------------//
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String updateRoom(@PathVariable Integer id, @Valid Room room, Model model) {
		roomService.update(room, id);
		return "redirect:/auth/admin/room"; // PRG Pattern

	}

	/********************* Update Room Request By ID **********/
	// ------------------GET REQUEST ---------------------//
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String updateBuildingForm(@PathVariable Integer id, Model model) {
		return getRoomForm(roomService.findOne(id), model);

	}
}
