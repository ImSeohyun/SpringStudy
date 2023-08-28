package com.service;

import java.util.List;

import com.dao.UserDAO;

public class UserService {

	UserDAO dao;     // constructor 주입
	int num;         // setter 메서드 주입  10
	String username; // setter 메서드 주입 "홍길동"
	
	// 생성자 주입
	public UserService(UserDAO xxx) {
		this.dao = xxx;
	}
	// setter 메서드 주입
	public void setNum(int num) {
		this.num = num;
	}
	// setter 메서드 주입
	public void setUsername(String username) {
		this.username = username;
	}

	public int getNum() {
		return num;
	}
	public String getUsername() {
		return username;
	}
	public List<String> list(){
		return dao.list();
	}
	
}
