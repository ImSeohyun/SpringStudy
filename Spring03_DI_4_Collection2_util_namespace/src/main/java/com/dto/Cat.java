package com.dto;

import java.util.Arrays;
import java.util.List;

public class Cat {

	String username;
	int age;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserDAO [username=" + username + ", age=" + age + "]";
	}
	
	
}
