package com.dey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dey.dao.RoomRepository;
import com.dey.model.Customer;
import com.dey.model.Room;
@Service
public class RoomService {

	
	@Autowired
	RoomRepository roomRepo;
	
	
	
	 
	
	public Room getRoomById(Long roomId) {
		// TODO Auto-generated method stub
		return roomRepo.findById(roomId).get();
	}





	public List<Room> findRoomAvailability() {
		// TODO Auto-generated method stub
		return roomRepo.findRoomByStatus(true);
	}





	public List<Room> findRoomNonAvailability() {
		// TODO Auto-generated method stub
		return  roomRepo.findRoomByStatus(false);
	}





	public List<Room> findAllRooms() {
		// TODO Auto-generated method stub
		return roomRepo.findAll();
	}





	/*public Customer findCustomerByRoomId(Long roomNo) {
		// TODO Auto-generated method stub
		return roomRepo.findCustomerByRoomNo(roomNo);
	}*/



	
}
