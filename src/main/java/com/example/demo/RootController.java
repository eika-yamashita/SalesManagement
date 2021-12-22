package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	@RequestMapping("/")
	public String root() {
		return "index";
	
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	
	}
}
