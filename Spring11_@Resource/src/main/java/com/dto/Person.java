package com.dto;

import javax.annotation.Resource;

public class Person {

	String username;

	@Resource(name="cat2")
	Cat cat;

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}
	
	
	
}
