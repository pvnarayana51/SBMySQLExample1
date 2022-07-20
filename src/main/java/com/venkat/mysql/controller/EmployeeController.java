package com.venkat.mysql.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.mysql.entity.EmployeeEntity;
import com.venkat.mysql.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public String addEmployeeDetails(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.addEmployee(employeeEntity);
		return "employee added successfully";
	}
	
	@GetMapping("/employee")
	public Optional<EmployeeEntity> getEmployeeDetails(@RequestParam int id) {
		Optional<EmployeeEntity> employee = employeeService.getEmployeebyId(id);
		return employee;
	}

}
