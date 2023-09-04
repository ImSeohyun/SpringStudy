package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDAO;

public class UserService {

	@Autowired
	UserDAO dao;
	
	public UserService() {}

	public UserService(UserDAO dao) {
		System.out.println("UserService(UserDAO dao)");
		this.dao = dao;
	}
	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		System.out.println("setDao(UserDAO dao)");
		this.dao = dao;
	}
	
	public List<String> list(){
		return dao.list();
	}

	
}
