package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.Employee;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface EmployeeRepository<P> extends CrudRepository<Employee, Long> {
	List<Employee> findByfirstname(String firstname);
	
	@Query ("select coalesce( max(id)) as empMaxId from Employee")
	Long empMaxId();	
}
