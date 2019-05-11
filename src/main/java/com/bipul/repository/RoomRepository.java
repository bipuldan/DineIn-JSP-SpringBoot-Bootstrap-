package com.bipul.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bipul.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer>{

	Room findByRoomNo(Long roomNo);

}
