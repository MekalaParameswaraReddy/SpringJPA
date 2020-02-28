package com.jpa.service;

import org.springframework.stereotype.Service;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
@Service
public class BasicService {

	public String wishMe(String name) {
		return "Hey " + name + " Welcome to JPA world";
	}
}
