package com.naresh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/first")
public class MyFirstController {
	
	@RequestMapping(value="/getMessage", method=RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("message", "Hello Anil How Are You!");
		return mv;
	}

	@RequestMapping(value="/getMessage2", method=RequestMethod.GET)
	public String getMessage2() {
		return "result2";
	}
}
