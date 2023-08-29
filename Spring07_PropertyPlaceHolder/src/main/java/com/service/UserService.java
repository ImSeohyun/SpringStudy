package com.service;

public class UserService {

	String driver;
	String url;
	String userid;
	String passwd;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "UserService [driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	
	
	
}
