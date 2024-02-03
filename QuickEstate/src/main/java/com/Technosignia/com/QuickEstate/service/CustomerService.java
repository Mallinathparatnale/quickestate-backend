package com.Technosignia.com.QuickEstate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Customer;
import com.Technosignia.com.QuickEstate.repository.CustomerRepository;

@Service
public class CustomerService {

	
	@Autowired
	CustomerRepository customerRepository;
	
	
	public Customer createCustomerDetails(Customer customer) {
		
		
		return customerRepository.save(customer);
		
	}


	public List<Customer> findAllCustomer() {
		
		return customerRepository.findAll();
	}

}
