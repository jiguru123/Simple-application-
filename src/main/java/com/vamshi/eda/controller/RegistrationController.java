package com.vamshi.eda.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamshi.eda.entity.Employee;
import com.vamshi.eda.service.EmployeeRegisterationService;

@RestController
@RequestMapping("/api")
public class RegistrationController {
	
	@Autowired 
	private EmployeeRegisterationService employeeRegisterationService;
	
	@PostMapping("/registeruser")
	public Employee registerEmployee(@RequestBody Employee employee) {
		employee.setCreatedOn(new Date());
		employee.setUpdatedOn(new Date());
	
		return 
	      employeeRegisterationService.saveEmployee(employee);
	}
	
	//@GetMapping

}
