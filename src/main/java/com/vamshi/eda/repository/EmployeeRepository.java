package com.vamshi.eda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vamshi.eda.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Object> {

}
