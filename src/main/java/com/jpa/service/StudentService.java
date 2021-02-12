package com.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa.dao.EmployeeDAO;
import com.jpa.dao.StudentDAO;
import com.jpa.entity.Student;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Service
@Transactional
public class StudentService {
	
	@Autowired
	@Qualifier("StudentDaoImpl")
	StudentDAO studentDAO;
	
	public List<Student> getAllStudentsData(){
		return studentDAO.getAllStudentsData();
	}
	
	public String deleteEmpNamesWithInCondition(String gender, String firstname) throws Exception{
		return studentDAO.deleteEmpNamesWithInCondition(gender, firstname);
	}
	
}
