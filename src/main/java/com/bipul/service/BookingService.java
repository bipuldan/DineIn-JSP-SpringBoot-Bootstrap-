package com.bipul.service;


import java.util.List;


import com.bipul.model.RoomBooking;
import com.bipul.repository.BookingRepository;

public interface BookingService {

	List<RoomBooking> listOfUnbooked(String roomNo);
	
	void prefill();
	
	void listOfUnbooked(String roomNo, String date);
	
	List<RoomBooking> listOfBooked();
	
	void unbookList(String roomNo, String date, Character status);

}
