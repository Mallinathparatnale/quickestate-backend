package com.Technosignia.com.QuickEstate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Property;
import com.Technosignia.com.QuickEstate.repository.PropertyRepository;

@Service
public class PropertyService {

	@Autowired
	PropertyRepository propertyRepository;
	
	public Property createPropertyDetails(Property property) {

		return propertyRepository.save(property);
	}

	public List<Property> getAllProperties() {

		return propertyRepository.findAll();
	}

	

}
