package com.dey.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dey.model.Customer;
import com.dey.model.Room;
@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{


	//public List<Room> findRoomByStatus(boolean status);

	public List<Room> findRoomByStatus(boolean status);
	
	public Room findByRoomNo(Long roomNo);
	

	//public Customer findCustomerByRoomNo(Long roomNo);
	
}
