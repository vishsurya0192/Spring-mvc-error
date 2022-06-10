package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	

}
