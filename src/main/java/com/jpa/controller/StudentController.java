package com.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Student;
import com.jpa.service.StudentService;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/getAllStudentsData")
	public List<Student> getAllStudentsData(){
		return studentService.getAllStudentsData();
	}
	
	@DeleteMapping(value = "/deleteStudentWithInCondition/{gender}/{firstname}")	
	public String deleteStudentWithInCondition(@PathVariable String gender, @PathVariable String firstname) throws Exception{
		return studentService.deleteEmpNamesWithInCondition(gender, firstname);
	}
	
	@GetMapping(value = "/test")
	public void  test() {
		LinkedMultiValueMap<String, String>  map = new LinkedMultiValueMap();
		List<String> list1 = new ArrayList<String>();
		list1.add("one1");
		list1.add("one11");
		List<String> list2 = new ArrayList<String>();
		list2.add("one2");
		list2.add("one22");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("one3");
		list3.add("one33");
		
		map.put("1", list1);
		map.put("1", list2);
		map.put("1", list3);
		System.out.println(map);
		System.out.println(map.getFirst("1"));
	}
}
