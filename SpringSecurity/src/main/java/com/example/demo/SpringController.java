package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

}