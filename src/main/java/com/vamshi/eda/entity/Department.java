package com.vamshi.eda.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collation = "departement")
public class Department {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Indexed(unique=true)
	@Field("dept_name")
	private String deptName;
	
	public Department() {
		
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + "]";
	}

	}
