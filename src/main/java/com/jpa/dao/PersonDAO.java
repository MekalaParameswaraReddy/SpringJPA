package com.jpa.dao;

import java.util.List;

import com.jpa.entity.Person;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface PersonDAO {
	
	public Person getPersonByAadharID(int id);
	
	public List<Person> getAllPersons();

}
