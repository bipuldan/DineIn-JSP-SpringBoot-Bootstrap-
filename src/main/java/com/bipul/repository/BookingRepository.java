package com.bipul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bipul.model.RoomBooking;

@Repository
public interface BookingRepository extends CrudRepository<RoomBooking, String>{

/*	
	List<RoomBooking> findByRoom(Long Id);*/
	
	@Query("SELECT rb FROM RoomBooking rb WHERE rb.room.roomNo=:roomNo and rb.RB_BOOKED='N'")
    List<RoomBooking> findByRoom(@Param("roomNo") String roomNo);
	
	@Query("SELECT rb FROM RoomBooking rb WHERE rb.room.roomNo=:roomNo and rb.RB_DATE=:date")
    RoomBooking findByRoomDate(@Param("roomNo") String roomNo, @Param("date") String date);
	
	@Query("SELECT rb FROM RoomBooking rb WHERE rb.room.roomNo=:roomNo and rb.RB_DATE=:date and rb.RB_BOOKED=:status")
    RoomBooking findByRoomDateRB_BOOKED(@Param("roomNo") String roomNo, @Param("date") String date, @Param("status") Character RB_BOOKED);
	
	@Query("SELECT rb FROM RoomBooking rb WHERE rb.RB_BOOKED='Y'")
	List<RoomBooking> findByRB_BOOKED();
}
