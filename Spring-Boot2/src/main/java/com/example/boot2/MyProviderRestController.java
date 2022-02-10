package com.example.boot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyProviderRestController {
	
	private static List<EmployeeDTO> employees = new ArrayList<>();
	
	
	static {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpId("EMP01");
		dto.setName("Naresh");
		employees.add(dto);
		
	}
	
	@GetMapping("/getEmp")
	public List<EmployeeDTO> getEmployee() {
		System.out.println("getEmp");
		
		return employees;
	}
	
	@PostMapping("/saveEmp")
	public String saveEmployee(@RequestBody EmployeeDTO emp) {
		System.out.println(emp);
		employees.add(emp);
		return "Success";
	}

}
