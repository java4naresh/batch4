package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	@GetMapping("/getMessage")
	public ModelAndView getMessage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("msg", "Hello World!");
		return mv;
	}

}
