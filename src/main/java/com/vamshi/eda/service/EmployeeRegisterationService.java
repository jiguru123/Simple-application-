package com.vamshi.eda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.eda.entity.Employee;
import com.vamshi.eda.repository.EmployeeRepository;

@Service
public class EmployeeRegisterationService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
