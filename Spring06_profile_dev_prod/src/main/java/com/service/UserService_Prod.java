package com.service;

public class UserService_Prod implements UserService {

	@Override
	public String mesg() {
		return "UserService_Prod 환경";
	}

}
