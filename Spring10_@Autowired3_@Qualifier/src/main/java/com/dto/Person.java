package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	String username;

	@Autowired
	@Qualifier(value = "cat1")
	Cat cat;

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}
	
	
	
}
