package com.Technosignia.com.QuickEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.com.QuickEstate.entity.Customer;
import com.Technosignia.com.QuickEstate.service.CustomerService;

@RestController
public class CusotmerController {

	
	@Autowired
	CustomerService customerService;
	
	// Adding comments to understand github
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomerDetails(customer);
		
	}
	
	@GetMapping("/customer")
	public List<Customer> findAllCustomer(){
		return customerService.findAllCustomer();
	}
	
}
