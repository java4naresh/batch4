package com.naresh.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String empId;
	
	private String name;

	

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", name=" + name + "]";
	}

	
	
}
