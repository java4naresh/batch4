package com.naresh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.naresh.model.Employee;
import com.naresh.service.EmployeeService;

@RequestMapping("/emp")
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ModelAndView saveEmployee(Employee emp) {
		try {
		String msg = service.saveEmployee(emp);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("message", msg);
		return mv;
		} catch(Exception e) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("error");
			mv.addObject(e.getMessage());
			return mv;
		}
		
	}
	
	@GetMapping("/deleteEmployee/{empId}")
	public ModelAndView deleteEmployee(@PathVariable("empId") String empId) {
		try {
			String msg = service.deleteEmployee(empId);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("deletePage");
			mv.addObject("message", msg);
			return mv;
		} catch(Exception ex) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("error");
			mv.addObject(ex.getMessage());
			return mv;
		}
	}
	
	@GetMapping("/getAllEmployees")
	public ModelAndView getAllEmployees() {
		try {
			List<Employee> list = service.getAllEmployees();
			ModelAndView mv = new ModelAndView();
			mv.setViewName("list");
			mv.addObject("list", list);
			return mv;
		} catch(Exception ex) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("error");
			mv.addObject(ex.getMessage());
			return mv;
		}
	}
	
	@GetMapping("/show/{empId}")
	public ModelAndView showEmployee(@PathVariable("empId") String empId) {
		try {
			Employee emp = service.getEmployeeById(empId);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("edit");
			mv.addObject("emp", emp);
			return mv;
		} catch(Exception ex) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("error");
			mv.addObject(ex.getMessage());
			return mv;
		}
	}

}
