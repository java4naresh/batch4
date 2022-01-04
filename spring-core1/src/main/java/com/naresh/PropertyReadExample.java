package com.naresh;

public class PropertyReadExample {
	
	String driverClassName;
	
	String userName;
	
	String password;
	
	String dbUrl;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	@Override
	public String toString() {
		return "PropertyReadExample [driverClassName=" + driverClassName + ", userName=" + userName + ", password="
				+ password + ", dbUrl=" + dbUrl + "]";
	}
	
	

}
