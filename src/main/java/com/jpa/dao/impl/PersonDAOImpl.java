package com.jpa.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.dao.PersonDAO;
import com.jpa.entity.Person;
import com.jpa.repository.PersonRepository;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Component("personDAOImpl")
public class PersonDAOImpl implements PersonDAO{
	
	@Autowired
	PersonRepository personRepository;	
	
	@Override
	public Person getPersonByAadharID(int id) {
		 Optional<Person> optional = personRepository.findById((long) id);
		return optional.get();
	}
	
	@Override
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}
	
	public void update(){
		personRepository.updateWithInCondition(2,12343);
		System.out.println("=== === update");
	}
	
}
