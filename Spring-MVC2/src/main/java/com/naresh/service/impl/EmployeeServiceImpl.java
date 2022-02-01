package com.naresh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naresh.dao.EmployeeDao;
import com.naresh.model.Employee;
import com.naresh.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	public String saveEmployee(Employee emp) {
		return dao.saveEmployee(emp);
	}

	public String deleteEmployee(String empId) {
		return dao.deleteEmployee(empId);
	}

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public Employee getEmployeeById(String empId) {
		return dao.getEmployeeById(empId);
	}

	public Employee updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}

}
