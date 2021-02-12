package com.jpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

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
	
	//@Query ("select emp from Employee emp where emp.id= :empId")
	@Query ("select emp from Employee emp where emp.id= :empId")
	Employee getEmp(@Param ("empId")int empid_1);
	
	@Query ("select count(distinct firstname) from Employee")
	int getEmpcountWithPipe();
	
	@Query ("select emp.firstname, emp.lastName from Employee emp where emp.id in(:list)")
	List getEmpNamesWithInCondition(@Param ("list")List<Long> empid_1);
	
	//@Query ("delete from Employee emp where emp.gender =:gender and emp.firstname in(:list)")
	//void deleteEmpNamesWithInCondition(@Param ("gender")String gender_1 ,@Param ("list")List<String> firstnames_1);
	
	@Transactional
	@Modifying
	@Query ("delete from Employee emp where emp.gender =:gender")
	void deleteEmpNamesWithInCondition(@Param ("gender")String gender_1 );
}
