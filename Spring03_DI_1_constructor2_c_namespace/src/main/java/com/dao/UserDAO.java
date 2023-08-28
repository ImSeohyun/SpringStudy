package com.dao;

import java.util.Arrays;
import java.util.List;

public class UserDAO {

	public List<String> list(){
		List<String> list =
				Arrays.asList("홍길동","이순신");
		return list;
	} 
}
