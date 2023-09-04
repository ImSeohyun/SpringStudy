package com.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {

	@Autowired(required=false)
	UserDAO dao;
	
	public List<String> list(){
		return Arrays.asList("홍길동","이순신");
	}
}
