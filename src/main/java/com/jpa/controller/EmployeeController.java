package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/getEmpByFirstName/{name}", method = RequestMethod.GET)
	public List<Employee> getEmployeeByFirstName(@PathVariable String name) {
		return employeeService.findByFirstName(name);
	}

	@GetMapping(value = "/allEmployees")
	public List<Employee> getAllEmployess() {
		return employeeService.getAllEmployees();
	}

	@GetMapping(value = "/allEmployeesById/{firstId}/{secondId}")
	public List<Employee> findAllEmployessByIds(@PathVariable int firstId, @PathVariable int secondId) {
		return employeeService.findAllEmployessByIds(firstId, secondId);
	}

	@GetMapping(value = "/getOptionalEmployeeById/{firstid}")
	public Employee findEmployeeById(@PathVariable int firstid) {
		return employeeService.findEmployeeById(firstid);
	}

	@PostMapping("/createEmpRecord")
	public boolean createEmpRecord(@RequestBody Employee emp) {
		return employeeService.createEmpRecord(emp);
	}

	@GetMapping(value = "/getRecordCount")
	public long getRecordCount() {
		return employeeService.getCount();
	}

	@DeleteMapping(value = "/deleteEmployee")
	public String deleteEmployee(@RequestBody Employee emp) {
		return employeeService.deleteEmployee(emp);
	}
	
	@GetMapping(value = "/employeeMaximumId")
	public Long empMaxId() {
		return employeeService.empMaxId();
	}
}
