package com.vamshi.eda.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collation = "userType")
public class UserType {

	@Id
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Field("user_type_name")
	private String userTypeName;
	
	public UserType() {
		
	}

	public UserType(String userTypeName) {
		super();
		this.userTypeName = userTypeName;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	@Override
	public String toString() {
		return "UserType [userTypeName=" + userTypeName + "]";
	}

	

}
