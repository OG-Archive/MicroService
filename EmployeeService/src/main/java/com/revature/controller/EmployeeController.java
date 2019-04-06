package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private Logger log = Logger.getLogger(EmployeeController.class);
	
	private List<Employee> employees = new ArrayList<>();

	public EmployeeController() {
		super();

		for(int i = 0; i < 10; i++) {
			employees.add(new Employee(i, "Bob"+i, "Smith", "bob"+i,"password",null));
		}
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	@GetMapping("/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId")Integer employeeId) {
		return employees.stream()
				.filter(emp -> emp.getId() == employeeId)
				.findFirst().get();
	}
	
	
	
}
