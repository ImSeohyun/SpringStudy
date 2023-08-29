package com.service;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.dto.Cat;

public class UserService2 implements InitializingBean, DisposableBean{

	public UserService2() {
		System.out.println("userservice2 생성자");
	}

	//DisposableBean
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy");
	}
	//InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet");
		
	}

	
}
