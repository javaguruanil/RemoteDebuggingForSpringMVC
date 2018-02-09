package com.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@Autowired
	public FirstClass fc;
	
	@RequestMapping(value = "/debug", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("msg", "Spring 3 MVC Hello World");
		int a , b, c;
		a = b= 88;
		c= a/b;
	    String s=fc.m1("MohanduAnil", c);	
	    System.out.println(s);
		return "hello";

	}
}