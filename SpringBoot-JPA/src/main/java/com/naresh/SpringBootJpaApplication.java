package com.naresh;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.Specification;

import com.naresh.entity.Employee;
import com.naresh.repository.EmployeeRepository;
import com.naresh.service.EmployeeService;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Employee emp = new Employee();
		emp.setEmpId("EMP451");
		emp.setExp(4);
		emp.setName("Naresh");
		service.save(emp);*/
		//Iterable<Employee> emp = repo.findAll();
		
		/*if(emp.isPresent()) {
			System.out.println(emp.get());
		}*/
		//emp.forEach(emps -> System.out.println(emp));
		//Employee emp = repo.getNamesFromEmployee("EMP451");
		//System.out.println(emp);
		Specification<Employee> spec = (employee, cq, cb) -> cb.equal(employee.get("name"), "Anil");
		Optional<Employee> emp2 = repo.findOne(spec);
		if(emp2.isPresent()) {
			System.out.println(emp2.get());
		}
		
	}
	
	

}
