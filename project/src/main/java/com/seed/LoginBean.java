package com.seed;

public class LoginBean {
	private String username;//property
	private String password;//property
	
	public LoginBean() {
		super();
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValid(){
		if(username!=null && password!=null && username.equals("joy") && password.equals("joy123"))
			return true;
		else
			return false;
	}

}
