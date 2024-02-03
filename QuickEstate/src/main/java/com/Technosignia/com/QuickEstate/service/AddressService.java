package com.Technosignia.com.QuickEstate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Address;
import com.Technosignia.com.QuickEstate.repository.AddressRespository;

@Service
public class AddressService {

	@Autowired
	AddressRespository addressRespository;
	
	
	public Address createAddress(Address address) {
		return addressRespository.save(address);
		
	}
}
