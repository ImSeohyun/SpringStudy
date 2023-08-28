package com.service;

public class UserService {

	int num;

	public UserService() {
		System.out.println("UserService 기본생성자");
	}
	
	//생성자 이용해서 주입
	public UserService(int num) {
		System.out.println("UserService(int num) 생성자");
		this.num = num;
	}
	
	//메서드
	public int getNum() {
		return num;
	}
}
