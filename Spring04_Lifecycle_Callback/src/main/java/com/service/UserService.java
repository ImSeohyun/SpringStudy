package com.service;

import java.util.List;

import com.dto.Cat;

public class UserService {

	public UserService() {
		System.out.println("userservice 생성자");
	}
	
	//init-method="xxx"
	public void xxx() { //return 타입과 파라미터 없어야함
		System.out.println("생성자 호출 후 xxx 호출");
	}
	//destroy-method="yyy"
	public void yyy(){
		System.out.println("yyy 호출");
	}
	
}
