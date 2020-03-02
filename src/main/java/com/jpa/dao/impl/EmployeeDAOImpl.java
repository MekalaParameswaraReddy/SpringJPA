package com.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.dao.EmployeeDAO;
import com.jpa.entity.Employee;
import com.jpa.repository.EmployeeRepository;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Component("empDaoImpl")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * findByfirstname is the user defined method : naming convention is
	 * mandatory like this [ firstname ] only
	 */
	@Override
	public List<Employee> findByFirstName(String name) {
		System.out.println("----- control is in Impl ----");
		List<Employee> employees = null;
		employees = employeeRepository.findByfirstname(name);
		System.out.println("----- control is in Impl ----" + employees);
		return employees;
	}

	/**
	 * findAllById is predifined method which is present in CrudRepository
	 * interface.
	 */
	@Override
	public List<Employee> getAllEmployees() {
		System.out.println(" ---- Control is in getAllEmployees() method ---- ");
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAllEmployessByIds(int firstid, int secondId) {
		System.out.println(" ---- Control is in findAllEmployessByIds(-,-) method ---- ");
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(firstid);
		ids.add(secondId);
		return (List<Employee>) employeeRepository.findAllById(ids);
	}

	/*
	 * findById is predifined method which is present in CrudRepository
	 * interface, Which return type is Optional<T>
	 */
	@Override
	public Employee findEmployeeById(int firstid) {
		System.out.println(" ---- Control is in findEmployeeById() method ---- ");
		Optional<Employee> optional = null;
		boolean flag = employeeRepository.existsById(firstid);
		if (flag) {
			optional = (Optional<Employee>) employeeRepository.findById(firstid);
		} else {
			System.out.println("no records found in employee table with given id = " + firstid);
			return null;
		}
		return optional.get();
	}

	@Override
	public boolean createEmpRecord(Employee emp) {
		System.out.println(" ---- Control is in createEmpRecord(-) method ---- ");
		return employeeRepository.save(emp) != null;
	}

	@Override
	public long getCount() {
		System.out.println(" ---- Control is in getCount() method ---- ");
		return employeeRepository.count();
	}

	/**
	 * delete(Object) & deleteById(id) both will delete the record, for delete
	 * method we have to pass the object : in this object it will take id as the
	 * criteria, for this return type is null.
	 * 
	 * deleteById method directly work on id, return type is void
	 */
	@Override
	public String deleteEmployee(Employee emp) {
		System.out.println(" ---- Control is in deleteEmployee(-) method ---- ");
		// employeeRepository.delete(emp);
		employeeRepository.deleteById(emp.getId());
		return emp.getId() + " record is deleted.....";
	}
	
	public Long empMaxId() {
		return employeeRepository.empMaxId();
	}
}
