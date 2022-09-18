package com.dey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dey.model.Customer;
import com.dey.model.Payment;
import com.dey.service.CustomerService;
import com.dey.service.PaymentService;

@RestController
@RequestMapping("/paymentapi")
public class PaymentController {

	
	@Autowired
	PaymentService paymentServe;
	
	@GetMapping("/payments")
	public List<Payment> showAllPayments() {
		return paymentServe.payment();
}
}
