package com.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa.dao.PersonDAO;
import com.jpa.entity.Person;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Service
@Transactional
public class PersonService {
	
	@Autowired
	@Qualifier("personDAOImpl")
	PersonDAO personDAO;
	
	public Person getPersonByAadharID(int id){
		return personDAO.getPersonByAadharID(id);
	}
	
	public List<Person> getAllPersons(){
		return personDAO.getAllPersons();
	}
	
	public void update(){
		personDAO.update();
	}
}
