package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDAO dao;
	
	@Override
	public List<String> list() {
		return dao.list();
	}

}
