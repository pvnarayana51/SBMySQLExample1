package com.venkat.mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.mysql.entity.EmployeeEntity;
import com.venkat.mysql.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(EmployeeEntity employeeEntity){
		employeeRepository.save(employeeEntity);
	}
	
	public Optional<EmployeeEntity> getEmployeebyId(Integer employeeId){
		Optional<EmployeeEntity> employee = employeeRepository.findById(employeeId);
		return employee;
	}

}
