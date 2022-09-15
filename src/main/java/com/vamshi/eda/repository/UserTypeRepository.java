package com.vamshi.eda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vamshi.eda.entity.UserType;

public interface UserTypeRepository  extends MongoRepository<UserType, String>{

}
