package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.MyRestService;
import com.naresh.dto.EmployeeDTO;

//@RestController
@Controller
public class MyFirstRestAPIController {
	
	@Autowired
	private MyRestService service;
	
	@GetMapping("/getMsg")
	public  String getMessage() {
		return "Hello World";
	}
	
	@GetMapping("/getEmp")
	public @ResponseBody List<EmployeeDTO> getEmployee() {
		
		return service.getEmployee();
	}
	
	@PostMapping("/saveEmp")
	public @ResponseBody String saveEmplpoyee(@RequestBody EmployeeDTO emp) {
		return service.saveEmployee(emp);
	}
	
	@PutMapping("/updateEmp")
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO emp) {
		System.out.println(emp);
		return emp;
	}
	
	@DeleteMapping("/deleteEmp/{empId}")
	public String deleteEmployee(@PathVariable("empId") String empId) {
		if("EMP01".equals(empId))
		throw new RuntimeException("EMPID is not valid");
		System.out.println(empId);
		return "Deleted";
	}
	
	@PostMapping("/empStd")
	public @ResponseBody String saveEmpStudent() {
		service.saveStudentEmployee();
		return "success";
	}

}
