package com.Technosignia.com.QuickEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.com.QuickEstate.entity.Property;
import com.Technosignia.com.QuickEstate.service.PropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	PropertyService propertyService;
	
	
	@PostMapping("/property")
	public Property createProperty(@RequestBody Property property) {
		return propertyService.createPropertyDetails(property);
	}
	
	@GetMapping("/property")
	public List<Property> getAllPropertyDetails(){
		return propertyService.getAllProperties();
		
	}

}
