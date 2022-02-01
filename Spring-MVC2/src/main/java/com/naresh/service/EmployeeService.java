package com.naresh.service;

import java.util.List;

import com.naresh.model.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee emp);
	
    public String deleteEmployee(String empId);
	
	public List<Employee> getAllEmployees();
	
    public Employee getEmployeeById(String empId);
    
    public Employee updateEmployee(Employee emp);

}
