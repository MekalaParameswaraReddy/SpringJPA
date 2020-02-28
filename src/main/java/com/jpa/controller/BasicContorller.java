package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.service.BasicService;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@RestController
@RequestMapping("/basicController")
public class BasicContorller {

	@Autowired
	BasicService basicService;

	@GetMapping("/wish/{name}")
	public String wish(@PathVariable("name") String name) {
		return basicService.wishMe(name);
	}

}
