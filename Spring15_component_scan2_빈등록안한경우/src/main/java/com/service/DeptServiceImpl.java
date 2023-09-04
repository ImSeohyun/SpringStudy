package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;

//@Component("service")
@Service("service")
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDAO dao;
	
	public DeptServiceImpl() {
		System.out.println("DeptServiceimpl 생성자");
	}
	
	@Override
	public List<String> list() {
		return dao.list();
	}

}
