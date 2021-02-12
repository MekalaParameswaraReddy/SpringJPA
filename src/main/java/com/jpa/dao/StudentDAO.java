package com.jpa.dao;

import java.util.List;

import com.jpa.entity.Student;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface StudentDAO {
	
	public List<Student> getAllStudentsData();
	
	public String deleteEmpNamesWithInCondition(String gender, String firstname)throws Exception ;
}
