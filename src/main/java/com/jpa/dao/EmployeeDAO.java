package com.jpa.dao;

import java.util.List;

import com.jpa.entity.Employee;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface EmployeeDAO {

	public List<Employee> findByFirstName(String name);

	public List<Employee> getAllEmployees();

	public List<Employee> findAllEmployessByIds(int firstid, int secondId);

	public Employee findEmployeeById(int firstid);

	public boolean createEmpRecord(Employee emp);

	public long getCount();

	public String deleteEmployee(Employee emp);
	
	public Long empMaxId();
	
	public void testRepository();
	
	public String deleteEmpNamesWithInCondition(String gender, String names);
}
