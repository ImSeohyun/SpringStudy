package com.dto;

import java.util.List;

public class Person {

	List<Cat> catList;
	
	//username만 저장
	List<String> usernameList;

	public List<String> getUsernameList() {
		return usernameList;
	}

	public void setUsernameList(List<String> usernameList) {
		this.usernameList = usernameList;
	}

	public List<Cat> getCatList() {
		return catList;
	}

	public void setCatList(List<Cat> catList) {
		this.catList = catList;
	}
	
	
}
