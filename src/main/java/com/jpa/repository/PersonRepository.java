package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Person;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
