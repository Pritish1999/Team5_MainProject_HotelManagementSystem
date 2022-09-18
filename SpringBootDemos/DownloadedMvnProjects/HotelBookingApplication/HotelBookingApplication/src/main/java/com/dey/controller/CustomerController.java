package com.dey.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dey.model.Customer;
import com.dey.model.Payment;
import com.dey.model.Room;
import com.dey.service.CustomerService;

@RestController
@RequestMapping("/custapi")
public class CustomerController {

	@Autowired
	CustomerService custServe;
	@GetMapping("/customers/{custId}")
	public Customer findCustomersByCustId(@PathVariable Long custId) {
		return custServe.getCustomers(custId);
	}
	

	@GetMapping("/customers")
	public List<Customer> showAllCustomer() {
		return custServe.ShowCustomers();
	}
	
	@PostMapping("/addcustomers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return custServe.addCustomer(customer);
	}
	@PutMapping("/customers/updateddetails/{custId}")
	public Customer CustomerDetailsUpdate(@RequestBody Customer customer,@PathVariable Long custId) {
		return custServe.CustomerDetailsUpdate(customer,custId);
	}
	@DeleteMapping("/customers/checkouts/{custId}")
	public void CustomerDelete(@PathVariable Long custId) {
		custServe.CustomerDelete(custId);
		
	}
	@PutMapping("/customers/payments/{custId}")
	public Customer CustomerPayment(@RequestBody Customer customer,@PathVariable Long custId) {
		return custServe.CustomerPayment(customer,custId);
	}
	
	
	
}
