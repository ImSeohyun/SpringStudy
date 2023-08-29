package com.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.dto.Cat;

public class UserService3 {

	public UserService3() {
		System.out.println("userservice3 생성자");
	}

	@PostConstruct
	public void xxx() {
		System.out.println("생성자 호출 후 @PostConstruct.xxx");
	}
	@PreDestroy
	public void yyy() {
		System.out.println("@PreDestroy.yyy");
	}
	
}
