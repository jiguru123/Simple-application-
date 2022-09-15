package com.vamshi.eda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.eda.entity.Employee;
import com.vamshi.eda.repository.DepartementRepository;
import com.vamshi.eda.repository.EmployeeRepository;
import com.vamshi.eda.repository.UserRepository;

@Service
public class EmployeeRegisterationService {
	
	@Autowired
	 EmployeeRepository employeeRepository;
    
	@Autowired
	DepartementRepository departementRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	
	
	public Employee saveEmployee(Employee employee) {
		if(employee.getUser() != null) {
			userRepository.save(employee.getUser());
		}
		if(employee.getDepartement() != null) {
			departementRepository.save(employee.getDepartement());
		}
		return employeeRepository.save(employee);
	}
	
}
