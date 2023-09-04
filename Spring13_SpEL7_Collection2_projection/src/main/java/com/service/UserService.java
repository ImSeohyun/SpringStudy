package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UserDAO;

public class UserService {

	@Autowired
	UserDAO dao;
	
	public List<String> list(){
		return dao.list();
	}

	
}
