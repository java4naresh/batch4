package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.MyRestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naresh.dto.EmployeeDTO;

@Service
public class MyRestServiceImpl implements MyRestService {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private StudentService stdService;

	@Override
	@Cacheable("employees")
	public List<EmployeeDTO> getEmployee() {
		
		ResponseEntity<List> emp = template.getForEntity("http://localhost:2022/getEmp", List.class);
		return emp.getBody();
	}

	@Override
	@CacheEvict(value="employees", allEntries = true)
	public String saveEmployee(EmployeeDTO dto) {
		String msg = template.postForObject("http://localhost:2022/saveEmp", dto, String.class);
		return msg;
	}
	
	@Transactional
	@Override
	public void saveStudentEmployee() {
		Employee emp = new Employee();
		emp.setEmp_id("123");
		emp.setName("Chiru");
		Student std = new Student();
		std.setId(1);
		std.setName("Student");
		
		empService.saveEmployee(emp);
		stdService.saveStudent(std);
	}

}
