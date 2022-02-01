package com.naresh.dao;

import java.util.List;

import com.naresh.model.Employee;

public interface EmployeeDao {
	
	public String saveEmployee(Employee emp);
	
	public String deleteEmployee(String empId);
	
	public List<Employee> getAllEmployees();
	
    public Employee getEmployeeById(String empId);
    
    public Employee updateEmployee(Employee emp);

}
