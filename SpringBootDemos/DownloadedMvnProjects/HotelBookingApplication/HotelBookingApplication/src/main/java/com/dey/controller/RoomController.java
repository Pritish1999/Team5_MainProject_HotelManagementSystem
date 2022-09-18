package com.dey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dey.model.Customer;
import com.dey.model.Room;
import com.dey.service.CustomerService;
import com.dey.service.RoomService;

@RestController
@RequestMapping("/roomapi")
public class RoomController {

	@Autowired
	RoomService roomserve;
	
	/*@GetMapping("/rooms/customerdetails/{roomNo}")
	public Customer findCustomerByRoomId(@PathVariable Long roomNo) {
		return roomserve.findCustomerByRoomId(roomNo);
	}*/
	@GetMapping("/rooms/statusunavailable")
	public List<Room> findRoomNonAvailability(){
		return roomserve.findRoomNonAvailability();
	}
	@GetMapping("/rooms")
	public List<Room> findAllRooms(){
		return roomserve.findAllRooms();
	}
	@GetMapping("/rooms/statusavailable")
	public List<Room> findRoomAvailability(){
		return roomserve.findRoomAvailability();
	}
	@GetMapping("/rooms/{roomId}")
	public Room findRoomsById(@PathVariable Long roomId) {
		return roomserve.getRoomById(roomId);
	}
	
}
