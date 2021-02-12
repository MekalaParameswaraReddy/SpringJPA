package com.jpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.entity.Person;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

	@Transactional
	@Modifying
	//@Query("delete from Student stu where stu.gender =:gender and stu.firstname in(:list) and stu.mobile >= :mobNum ")	
	//void updateWithInCondition(@Param("gender") String gender_1, @Param ("list")List<String> firstnames_1, @Param ("mobNum")int mobNum_1)
	@Query("update Person per set per.gender='M' where per.personId.id=:id and per.personId.aadhaar=:aadhaar")
	void updateWithInCondition(@Param ("id")int id_, @Param ("aadhaar")int aadhaar_);
}
