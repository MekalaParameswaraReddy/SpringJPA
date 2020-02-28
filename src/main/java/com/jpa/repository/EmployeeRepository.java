package com.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.Employee;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface EmployeeRepository<P> extends CrudRepository<Employee, Long> {
	List<Employee> findByfirstname(String firstname);
}