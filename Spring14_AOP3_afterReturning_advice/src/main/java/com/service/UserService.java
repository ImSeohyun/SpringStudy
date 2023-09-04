package com.service;

//타겟 객체: 핵심 기능 구현 빈
public class UserService {

	//핵심처리 메서드
	public String sayEcho() {
		System.out.println("sayEcho");
		return "hello";
	}
	
	public String callEcho() {
		System.out.println("callEcho");
		return "world";
	}

	
}
