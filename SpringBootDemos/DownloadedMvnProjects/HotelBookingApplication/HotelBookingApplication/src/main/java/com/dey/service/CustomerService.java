package com.dey.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dey.dao.CustomerRepository;
import com.dey.dao.PaymentRepository;
import com.dey.dao.RoomRepository;
import com.dey.model.Customer;
import com.dey.model.Payment;
import com.dey.model.Room;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository custRepo;
	@Autowired
	RoomRepository roomRepo;
	
	@Autowired
	PaymentRepository pmtRepo;
	

	public Customer getCustomers(Long custId) {
		// TODO Auto-generated method stub
		return  custRepo.findById(custId).get();
		
		
		
		
	}



	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		custRepo.save(customer);
		long custid = customer.getRoom().getRoomNo();
		Room r=roomRepo.findByRoomNo(custid);
		r.setStatus(false);
		System.out.println(roomRepo.save(r));
		return customer;
		
	}
	

	public Customer CustomerDetailsUpdate(Customer customer,Long custId) {
		// TODO Auto-generated method stub
		Customer update=getCustomers(custId);
		update.setCheckOutDate(customer.getCheckOutDate());
		//update.setRoom(customer.getRoom());
		update.setEmail(customer.getEmail());
		update.setPhoneNo(customer.getPhoneNo());
		return custRepo.save(update);
		
	}


	public void CustomerDelete(Long custId) {
		// TODO Auto-generated method stub
		custRepo.findById(custId).get().getRoom().setStatus(true);
		custRepo.deleteById(custId);
		
	}


	public List<Customer> ShowCustomers() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}
	public Customer CustomerPayment(Customer customer, Long custId) {
		// TODO Auto-generated method stub
		Customer cust= custRepo.findById(custId).get();
		cust.getPmt1().setPaidAmount(customer.getPmt1().getPaidAmount());
		cust.getPmt1().setBalance(customer.getPmt1().getBalance());
		return custRepo.save(cust);
	}



	
	
}
