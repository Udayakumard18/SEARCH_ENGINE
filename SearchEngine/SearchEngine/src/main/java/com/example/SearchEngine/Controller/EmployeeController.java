package com.example.SearchEngine.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SearchEngine.model.Employee;
import com.example.SearchEngine.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("index")
	public String viewHomePage1(Model model, @Param("keyword")String keyword) {
		List<Employee> listEmployee = service.listAll(keyword);
		
		
		model.addAttribute("listEmployee", listEmployee);
		model.addAttribute("keyword", keyword);
		return "index";
		
	}

}
