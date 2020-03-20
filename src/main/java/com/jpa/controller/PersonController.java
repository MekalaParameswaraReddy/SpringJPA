package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.entity.Person;
import com.jpa.service.PersonService;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;	
	
	@PostMapping(value = "/getOptionalPersonByAadhaarId/{aadhaarId}")
	public Person findEmployeeById(@PathVariable int aadhaarId) {
		return personService.getPersonByAadharID(aadhaarId);
	}
	
	@GetMapping(value = "/getAllPersons")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}
	
}
