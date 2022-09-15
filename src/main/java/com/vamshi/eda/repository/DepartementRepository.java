package com.vamshi.eda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vamshi.eda.entity.Department;

public interface DepartementRepository extends MongoRepository<Department, String> {

}
