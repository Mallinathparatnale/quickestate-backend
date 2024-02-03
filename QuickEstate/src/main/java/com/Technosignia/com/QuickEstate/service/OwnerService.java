package com.Technosignia.com.QuickEstate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Owner;
import com.Technosignia.com.QuickEstate.entity.Property;
import com.Technosignia.com.QuickEstate.repository.OwnerRepository;

@Service
public class OwnerService {

	@Autowired
	OwnerRepository ownerRepository;
	
	@Autowired PropertyService propertyService;
	
	
	public  Owner createownerDetails(Owner owner) {
		
		return ownerRepository.save(owner);
		
	}

	public List<Owner> findAllOwnerDetails() {
		return ownerRepository.findAll();
		
	}

	public Owner findOwnerWithPropertyById(Long id) {
		
		List<Property>	props    = 	propertyService.getAllProperties();
			
		Optional<Owner> opOwner = ownerRepository.findById(id);
		
		Owner owner = null;
		
		if(opOwner.isPresent()) {
			owner = opOwner.get();
		}
		
		List<Property>	customProp = new ArrayList<>();
		
		for(Property prop: props) {
			if(prop.getOwner().getId()==id) {
				
				customProp.add(prop);
				
				owner.setProperty(customProp);
			}
		}
		
		
		return owner;
		
	}

}
