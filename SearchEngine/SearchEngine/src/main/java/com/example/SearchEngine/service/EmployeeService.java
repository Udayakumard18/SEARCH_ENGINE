package com.example.SearchEngine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SearchEngine.model.Employee;
import com.example.SearchEngine.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	
	public List<Employee> listAll(String keyword){
		if(keyword != null) {
			return repo.search(keyword);
			
		}else {
			return (List<Employee>)repo.findAll();
		}
	}

}