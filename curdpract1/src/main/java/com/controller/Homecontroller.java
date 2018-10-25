package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ServiceInterface.ServiceIn;
import com.model.Login;
import com.model.Student;



@Controller
public class Homecontroller {
	@Autowired
	ServiceIn service;
	@RequestMapping("/")
	public String login()
	{
		System.out.println("In login");
		System.out.println("In login page ");
		return "login";
		
		
	}
	
	@RequestMapping("/reg")
	public String registerPage()
	{
		return "Register";
	}
	
	
	@RequestMapping("/register")
	public String save(@ModelAttribute Student s, Login l, Model model)
	{
		System.out.println("In register page");
		s.setLogin(l);
		if(service.save(s)!=null)
		{
		String msg ="Registration Successfull....";
		model.addAttribute("msg", msg);
		return "Success";
		}
		else
		{
			String msg ="Registration Not done....";
			model.addAttribute("msg", msg);
			return "login";
		}
	}
	
/*@RequestMapping("/update")
public String updateRecord(@ModelAttribute Login l,Student s, Model model)
{
System.out.println("In updateRecord of homecontroller");
s.setLogin(l);
service.save(s);
return "Success";
}
*/
	
	@RequestMapping("/edit")
	public String editRecord(@ModelAttribute Student s, Model model)
	{
		System.out.println("In editRecord of homecontroller----id :"+s.getId());
		Student s1=service.findAllById(s.getId());
		model.addAttribute("data", s1);
		return "edit";
	}
}
