package com.firstspringbootapp.dao;

import java.util.List;

import com.firstspringbootapp.model.Employee;

public interface EmployeeDao{

	 public default List<Employee> readAllEmployees(){
		 return readAllEmployees();

}}
