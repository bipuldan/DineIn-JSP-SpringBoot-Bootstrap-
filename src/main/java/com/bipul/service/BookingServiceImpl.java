package com.bipul.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bipul.model.Room;
import com.bipul.model.RoomBooking;
import com.bipul.repository.BookingRepository;
import com.bipul.repository.RoomRepository;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository br;
	
	@Autowired
	private RoomRepository rr;

	public List<RoomBooking> listOfUnbooked(String roomNo){
		List<RoomBooking> roomList= new ArrayList<RoomBooking>();
		for(RoomBooking rb:br.findByRoom(roomNo))
			roomList.add(rb);
		System.out.println(roomList.size());
		return roomList;
	}
	
	public void listOfUnbooked(String roomNo, String date){
		
		RoomBooking updateRb = br.findByRoomDate(roomNo, date);
		updateRb.setRB_BOOKED('Y');
		br.save(updateRb);
	}
	
	@Override
	public void unbookList(String roomNo, String date, Character status) {

		RoomBooking updateRb = br.findByRoomDateRB_BOOKED(roomNo, date, status);
		System.out.println(updateRb);
		updateRb.setRB_BOOKED('N');
		br.save(updateRb);
	}
	
	public List<RoomBooking> listOfBooked(){
		List<RoomBooking> roomList= new ArrayList<RoomBooking>();
		for(RoomBooking rb:br.findByRB_BOOKED())
			roomList.add(rb);
		return roomList;
	}


	@Override
	public void prefill() {
		
		Room r = new Room();
		Room r1 = new Room();
		RoomBooking rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("21-01-2019");
		rb.setRoom(r);
		rr.save(r);
		br.save(rb);

		rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('Y');
		rb.setRB_DATE("21-04-2019");
		rb.setRoom(r);
		br.save(rb);
		
		rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("21-06-2019");
		rb.setRoom(r);
		br.save(rb);
		
		rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('Y');
		rb.setRB_DATE("21-05-2019");
		rb.setRoom(r);
		br.save(rb);
		
		rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("27-04-2019");
		rb.setRoom(r);
		br.save(rb);
		
		rb = new RoomBooking();
		r1.setRoomNo("417");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("21-04-2019");
		rb.setRoom(r);
		rr.save(r1);
		br.save(rb);
		
		rb = new RoomBooking();
		r1.setRoomNo("417");
		rb.setRB_BOOKED('Y');
		rb.setRB_DATE("21-04-2019");
		rb.setRoom(r1);
		br.save(rb);
		
		rb = new RoomBooking();
		r1.setRoomNo("417");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("29-04-2019");
		rb.setRoom(r1);
		br.save(rb);
		
		rb = new RoomBooking();
		r1.setRoomNo("417");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("15-11-2019");
		rb.setRoom(r1);
		br.save(rb);
		
		rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("21-10-2019");
		rb.setRoom(r);
		br.save(rb);
		
		rb = new RoomBooking();
		r.setRoomNo("413");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("20-09-2019");
		rb.setRoom(r);
		br.save(rb);
		
		rb = new RoomBooking();
		r1.setRoomNo("417");
		rb.setRB_BOOKED('N');
		rb.setRB_DATE("21-12-2019");
		rb.setRoom(r1);
		br.save(rb);
	}


}
