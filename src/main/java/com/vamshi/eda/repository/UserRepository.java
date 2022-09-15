package com.vamshi.eda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vamshi.eda.entity.User;

public interface UserRepository extends MongoRepository<User,String> {

}
