package com.firstspringbootapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringbootapp.model.Employee;
import com.firstspringbootapp.service.EmployeeService;

@RestController

public class FirstController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/first")
	public String firstMethod(){
		return "welcome sabi";
	}
	@GetMapping(value="/second")
	public Employee secondMethod(){
		return new Employee(12, "sabitha");
	}
	@GetMapping(value="/third/{abc}")
	public Employee thirdMethod(@PathVariable(value="abc")int empNo){
		Employee employee = null;
		if(empNo == 10){
			employee = new Employee(10,"sabi");
		}
		if(empNo == 20){
			employee = new Employee(20,"babu");
		}
		return employee;
	}
	@GetMapping(value="/fourth")
public List<Employee> getEmployees(){

	return employeeService.readAllEmployees();
}
}
