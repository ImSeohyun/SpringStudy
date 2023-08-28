package com.service;

public class UserService {

	int num;
	
	// setter 메서드 이용한 의존성 주입
	public void setNum(int num) {
		System.out.println("setNum 메서드");
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
