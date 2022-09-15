package com.vamshi.eda.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user")
public class User {
	
	@Id
	private String id;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	private String name;
	
	private int age;
	
	@Field("date_of_birth")
	private String dateOfBirth;
	
	@Field("user_name")
	private String userName;
	
	private String password;
	
	@DBRef
	private UserType userType;
	
	
	public User() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", userName=" + userName
				+ ", password=" + password + ", userType=" + userType + "]";
	}


	public User(String name, int age, String dateOfBirth, String userName, String password, UserType userType) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}

}
