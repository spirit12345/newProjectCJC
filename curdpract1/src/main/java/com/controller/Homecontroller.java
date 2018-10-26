package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


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
		return "login";
		
		
	}
	
	@RequestMapping("/log")
	public String loginCheck(@ModelAttribute Student s, Login l, Model model)
	{
		System.out.println("In Checklogin of homecontroller");
		List data=service.getAll(s);
		model.addAttribute("msg", "Welcome to Success Page");
		model.addAttribute("data", data);
		return "Success";

		
	}
	
	@RequestMapping("/reg")
	public String registerPage()
	{
		return "Register";
	}
	
	/*@RequestMapping("/demo")
	public String demo()
	{
		System.out.println("do not think about it....just a demo");
		return "demo";
	}*/
	
	@RequestMapping("/register")
	public String save(@ModelAttribute Student s, Login l, Model model)
	{
		System.out.println("In register page");
		s.setLogin(l);
		if(service.save(s)!=null)
		{
		String msg ="Registration Successfull....";
		model.addAttribute("msg", msg);
		return "login";
		}
		else
		{
			String msg ="Registration Not done....";
			model.addAttribute("msg", msg);
			return "login";
		}
	}

	@RequestMapping("/login")
	public ModelAndView LoginUser(@ModelAttribute Student s,@ModelAttribute Login l)
	{
		
		System.out.println(l.getUsername()+" "+l.getPassword());
		Login lt=service.findAllByUsernameAndPassword(l.getUsername(),l.getPassword());
		
		if(lt!=null)
		{
			
			List<Student> lst=service.getAll(s);
			System.out.println(lst);
			return new ModelAndView("Success","data",lst);
			
		}
		else
		{
			
			return new ModelAndView("login","msg","Incorrect username and password");
		}
		
		
	}	

/*@RequestMapping("/update")
public String updateRecord(@ModelAttribute Login l,Student s, Model model)
{
System.out.println("In updateRecord of homecontroller"+s.getName()+"  "+s.getAddress());
s.setLogin(l);
List data=service.updateStudent(s);
model.addAttribute("msg", "Welcome to Success Page after updating record");
model.addAttribute("data", data);
return "Success";
}*/

	
	@RequestMapping("/del")
	public ModelAndView deletedata(@ModelAttribute Student s,@ModelAttribute Login l)
	{
		
		
		System.out.println("in delete");
		
	            List<Student> st=service.delete(s);
		System.out.println(st);
		System.out.println("in delete");
		return new ModelAndView("Success","data",st);
		
		
		
	}


	
	
	
	@RequestMapping("/edit")
	public String editRecord(@ModelAttribute Student s,Login l, Model model)
	{
		System.out.println("In editRecord of homecontroller----id :"+s.getId());
		Student s1=service.findAllById(s.getId());
		model.addAttribute("data", s1);
		return "edit";
	}
}
