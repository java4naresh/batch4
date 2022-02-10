package com.example.demo.service;

import java.util.List;

import com.naresh.dto.EmployeeDTO;

public interface MyRestService {
	
	
	public List<EmployeeDTO> getEmployee();

	String saveEmployee(EmployeeDTO dto);

	void saveStudentEmployee();

}
