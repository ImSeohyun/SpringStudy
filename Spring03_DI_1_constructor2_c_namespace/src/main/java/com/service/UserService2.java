package com.service;

public class UserService2 {

	int num;
	String username;

	public UserService2() {
		System.out.println("UserService 기본생성자");
	}
	
	//생성자 이용해서 주입
	public UserService2(int num, String username) {
		System.out.println("UserService(int num) 생성자");
		this.num = num;
		this.username = username;
	}
	
	//메서드
	public int getNum() {
		return num;
	}
	public String getUsername() {
		return username;
	}
}
