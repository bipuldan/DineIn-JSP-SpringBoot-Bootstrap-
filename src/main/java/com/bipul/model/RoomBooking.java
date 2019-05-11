package com.bipul.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RoomBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long RB_ID;
	
	@ManyToOne
	private Room room;
	
	private String RB_DATE;
	private Character RB_BOOKED;
	
	
	public Long getRB_ID() {
		return RB_ID;
	}
	public void setRB_ID(Long rB_ID) {
		RB_ID = rB_ID;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public String getRB_DATE() {
		return RB_DATE;
	}
	public void setRB_DATE(String rB_DATE) {
		RB_DATE = rB_DATE;
	}
	public Character getRB_BOOKED() {
		return RB_BOOKED;
	}
	public void setRB_BOOKED(Character rB_BOOKED) {
		RB_BOOKED = rB_BOOKED;
	}
	
	@Override
	public String toString() {
		return "RoomBooking [RB_ID=" + RB_ID + ", room=" + room + ", RB_DATE=" + RB_DATE + ", RB_BOOKED=" + RB_BOOKED
				+ "]";
	}

}
