package com.naresh.dto;

public class UserDto {
	
	String userName;
	
	String pwd;
	
	public UserDto(String name) {
		System.out.println("user-cons");
	}
	
	public UserDto(int num) {
		System.out.println("int-cons");
	}

	public UserDto() {
		
	}
	
	
	public UserDto(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
		System.out.println("Parameterized Cons");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setUserName");
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		System.out.println("setPwd");
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserDto [userName=" + userName + ", pwd=" + pwd + "]";
	}
	
	
	

}
