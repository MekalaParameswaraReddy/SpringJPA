package com.jpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.entity.Student;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
	
	@Transactional
	@Modifying
	@Query("delete from Student stu where stu.gender =:gender and stu.firstname in(:list) and stu.mobile >= :mobNum ")
	void deleteStudentWithInCondition(@Param("gender") String gender_1, @Param ("list")List<String> firstnames_1, @Param ("mobNum")int mobNum_1) throws Exception;
}
