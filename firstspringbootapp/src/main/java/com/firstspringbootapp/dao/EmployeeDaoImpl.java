package com.firstspringbootapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.firstspringbootapp.model.Employee;
@Repository

public class EmployeeDaoImpl implements EmployeeDao {
@Override
public List<Employee> readAllEmployees(){
	List<Employee> employees = new ArrayList<Employee>();
	Employee employee1 = new Employee(1,"anto dao");
	Employee employee2 = new Employee(2,"raji");
	Employee employee3 = new Employee(3,"ramya");
	Employee employee4 = new Employee(4,"krithi");
	Employee employee5 = new Employee(5,"sowmi");
	employees.add(employee1);
	employees.add(employee2);
	employees.add(employee3);
	employees.add(employee4);
	employees.add(employee5);
	return employees;
}
}
