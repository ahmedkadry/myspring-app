package com.A7meD.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "ALLAH AKBER";
	}

	@GetMapping("/")
	public String home() {
		return "home";
	}

}
