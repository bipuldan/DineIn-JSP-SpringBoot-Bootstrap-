package com.bipul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bipul.model.RoomBooking;
import com.bipul.service.BookingServiceImpl;

@Controller
public class ApplicationController {

	@Autowired
	private BookingServiceImpl bs;

	private static List<RoomBooking> unbookedList;

	@RequestMapping("/")
	public String welcomeBooking() {
		//bs.prefill();
		return "welcomeBooking";
	}

	@RequestMapping(value = "/unbookedList", method = RequestMethod.POST)
	public String listOfUnbooked(@RequestParam String roomNo, ModelMap mainModel) {
		String rNo = roomNo;
		System.out.println(rNo);
		unbookedList = bs.listOfUnbooked(roomNo);
		System.out.println(unbookedList.size() + " Controller");
		mainModel.addAttribute("list", unbookedList);
		if (unbookedList.isEmpty()) {
			System.out.println(unbookedList.size() + "Empty");

			return "redirect:warning";
		} else
			return "redirect:list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listPage(Model model) {
		model.addAttribute("list", unbookedList);
		return "roomList";
	}

	@RequestMapping(value = "/warning", method = RequestMethod.GET)
	public String warningPage() {
		return "warningPage";
	}

	@RequestMapping(value = "/roomsListUpdate")
	public String updateList(@RequestParam String roomVal, @RequestParam String date, Model model) {

		bs.listOfUnbooked(roomVal, date);
		model.addAttribute("message", "You Successfully booked :)");
		return "welcomeBooking";
	}
	
	@RequestMapping(value = "/bookedList", method = RequestMethod.GET)
	public String listOfBookedRoom(Model model){
		List<RoomBooking> bookedList = bs.listOfBooked();
		model.addAttribute("bList", bookedList);
		System.out.println(bookedList.size());
		return "bookedList";
	} 
	
	@RequestMapping(value = "/unbookRoom")
	public String updatedUnbookList(@RequestParam String roomVal, @RequestParam String date, @RequestParam Character status, Model model) {
		System.out.println(roomVal+" "+status+" "+date);

		bs.unbookList(roomVal, date, status);
		model.addAttribute("message", "You Successfully unbooked :)");
		return "welcomeBooking";
	}
}
