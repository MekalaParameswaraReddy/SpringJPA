package com.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa.dao.EmployeeDAO;
import com.jpa.entity.Employee;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Service
@Transactional
public class EmployeeService {

	@Autowired
	@Qualifier("empDaoImpl")
	EmployeeDAO employeeDAO;

	public List<Employee> findByFirstName(String name) {		
		return employeeDAO.findByFirstName(name);
	}

	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	public List<Employee> findAllEmployessByIds(int firstid, int secondId) {
		return employeeDAO.findAllEmployessByIds(firstid, secondId);
	}

	public Employee findEmployeeById(int firstid) {
		return employeeDAO.findEmployeeById(firstid);
	}

	public boolean createEmpRecord(Employee emp) {
		return employeeDAO.createEmpRecord(emp);
	}

	public long getCount() {
		return employeeDAO.getCount();
	}

	public String deleteEmployee(Employee emp) {
		return employeeDAO.deleteEmployee(emp);
	}
	
	public Long empMaxId() {
		return employeeDAO.empMaxId();
	}
	
	public void testRepository(){
		employeeDAO.testRepository();
	}
	
	public String deleteEmpNamesWithInCondition(String gender, String names){
		return employeeDAO.deleteEmpNamesWithInCondition(gender, names);
	}
}
