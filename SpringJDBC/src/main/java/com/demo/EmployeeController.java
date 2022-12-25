package com.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDoaIml edi;
	@RequestMapping("/show")
	public ModelAndView displayEmp() {
		
		Employee emp=new Employee();
		return new ModelAndView("addEmployee","command",emp);
	}
	@RequestMapping (value="savefood",method=RequestMethod.POST)
	public String savefood(@ModelAttribute("emp")Employee emp) {
		edi.addEmployee(emp);
		return "sucess";
	}
	@RequestMapping("/showEmpRecord")
	public ModelAndView showFoods(HttpSession session) {
		List <Employee> empList=edi.getAllEmployee();
		session.setAttribute("list", empList);
		return new ModelAndView("EmployeeList","empList",empList);
	}

}
