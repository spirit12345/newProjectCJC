package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Homecontroller {
	
	@RequestMapping("/")
	public String login()
	{
		System.out.println("In login");
		System.out.println("login page");
		return "login";
		
		
	}
	
	@RequestMapping("/register")
	public String Register()
	{
		System.out.println("In register page");
		return "Register";
	}
	

}
