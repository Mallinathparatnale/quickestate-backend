package com.Technosignia.com.QuickEstate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.com.QuickEstate.entity.Owner;
import com.Technosignia.com.QuickEstate.service.OwnerService;

@RestController
public class OwnerController {

	
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/owner")
	public Owner createOwnerDetails(@RequestBody Owner owner) {
		return ownerService.createownerDetails(owner);
		
	}
	
	@GetMapping("/owner")
	public List<Owner> findAllOwnerDetailswithProperty(){
		return ownerService.findAllOwnerDetails();
		
	}
	
	@GetMapping("/owner/{id}")
	public Owner getOwnerDetailswithPropertyById(@PathVariable Long id) {
		
	return ownerService.findOwnerWithPropertyById(id);
	
		
	}
}
