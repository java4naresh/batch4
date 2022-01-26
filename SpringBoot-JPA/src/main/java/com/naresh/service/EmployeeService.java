package com.naresh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.entity.Employee;
import com.naresh.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository repo;
	
	public String save(Employee emp) {
		emp = repo.save(emp);
		return "Saved Succesfully";
	}

}
