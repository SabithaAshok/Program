package com.firstspringbootapp.service;

import java.util.List;

import com.firstspringbootapp.model.Employee;

public interface EmployeeService {
	public abstract List<Employee> readAllEmployees();

}
