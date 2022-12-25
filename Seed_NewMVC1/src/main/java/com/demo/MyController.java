package com.demo;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	@RequestMapping("/h")
	public String dispalay() {
		
		return "Welcome";
	}
	
	
	@RequestMapping("/h1")
	public String dispalay_1() {
		
		return "Hello";
	}
	
	@RequestMapping("/login")
	public ModelAndView displayModel() {
		String emailId="a@gmail.com";
		return new ModelAndView("Hello","email",emailId);
	}
	
	@RequestMapping("/list")
	public ModelAndView displayList() {
		
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Ramesh");
		alist.add("Suresh");
		alist.add("Satish");
		alist.add("Geeta");
		return new ModelAndView("NameList","list",alist);
		
	}
	@RequestMapping("/list_1")
	public ModelAndView display_list() {
		ModelAndView  m=new ModelAndView("DisplayList");
		m.addObject("email", "A@gmail.com");
		return m;

}
	
	@RequestMapping("/loginform")
	public String showLoginForm() {
		return "Login";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String saveLogin(HttpServletRequest request) {
		
		String emailId=request.getParameter("uname");
		String password=request.getParameter("pass");
		if(emailId.equals("seed")&& password.equals("123"))
		{
			return "Success";
					
		}
		else
		{
			
			return "Fail";
		}
		
		
		
	}
	
	
}
