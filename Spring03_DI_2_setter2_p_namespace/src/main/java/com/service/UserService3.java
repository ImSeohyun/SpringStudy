package com.service;

import java.util.List;

import com.dao.UserDAO;

public class UserService3 {

		UserDAO dao;

		// setter 메서드 이용한 의존성 주입
		public void setDao(UserDAO dao) {
			this.dao = dao;
		}
		
		public List<String> list(){
			return dao.list();
		}
}
