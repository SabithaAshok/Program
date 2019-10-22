package com.firstspringbootapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstspringbootapp.dao.EmployeeDao;
import com.firstspringbootapp.model.Employee;
@Service

public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao;
	@Override
	public List<Employee> readAllEmployees(){
		return dao.readAllEmployees();
	}

}
