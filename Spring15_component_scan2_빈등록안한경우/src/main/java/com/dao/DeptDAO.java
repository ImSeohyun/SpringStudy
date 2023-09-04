package com.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("dao")
@Repository("dao")
public class DeptDAO {
	
	public List<String> list(){
		return Arrays.asList("홍길동","이순신");
	}
	
	public DeptDAO() {
		System.out.println("DeptDAO 생성자");
	}
}
