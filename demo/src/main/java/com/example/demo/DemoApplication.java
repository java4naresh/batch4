package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naresh.dto.EmployeeDTO;

@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
//@ComponentScan(basePackages = {"com.example.repo","com.example.controller", "com.example.entity", "com.example.service","com.example.service.impl" })
public class DemoApplication {

	public static void main(String[] args) {
		String strJson = "{\"empId\":\"EMP01\",\"name\":\"Naresh\"}";
		//EmployeeDTO dto = new EmployeeDTO();
		//dto.setEmpId("EMP01");
		//dto.setName("Naresh");
		ObjectMapper mapper = new ObjectMapper();
		try {
			//String json = mapper.writeValueAsString(dto);
			//System.out.println(json);
			EmployeeDTO dto = mapper.readValue(strJson,EmployeeDTO.class);
			System.out.println(dto);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
