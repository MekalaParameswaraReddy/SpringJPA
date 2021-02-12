package com.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.dao.StudentDAO;
import com.jpa.entity.Student;
import com.jpa.repository.StudentRepository;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Component("StudentDaoImpl")
@Transactional
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudentsData() {		
		return (List<Student>) studentRepository.findAll();
	}
	
	@Override
	public String deleteEmpNamesWithInCondition(String gender, String firstname) throws Exception {
		List<String> li = new ArrayList<String>();
		li.add(firstname);
		li.add("rang");
		studentRepository.deleteStudentWithInCondition(gender, li, 1235);
		return "success";
	}
	
	
}
