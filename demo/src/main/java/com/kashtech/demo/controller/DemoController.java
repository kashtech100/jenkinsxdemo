package com.kashtech.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kashtech.demo.model.Employee;

/**
 * @author kashifshah
 *
 */
@RestController
public class DemoController {
	
	/*private List<Employee> employees = new ArrayList<Employee>();
	employees.add(new Employee(1, "Kashif "));
	employees.add(new Employee(2, "Sa "));
	employees.add */
	

	@GetMapping
	public String hello(){
		return "Hello ";
	}
	
	@PostMapping
	public void helloWorld(){
		
	}
	

}
