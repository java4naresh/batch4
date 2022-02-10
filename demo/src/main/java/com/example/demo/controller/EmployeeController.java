package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ModelAndView saveEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		try {
			String msg = service.saveEmployee(emp);
			mv.setViewName("saveResult");
			mv.addObject("msg", msg);
			return mv;
			
		} catch(Exception e) {
			e.printStackTrace();
			mv.setViewName("error");
			mv.addObject("msg", e.getMessage());
			return mv;
		}
	}

}
