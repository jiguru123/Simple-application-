package com.vamshi.eda.entity;


import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "employee")
public class Employee  {

	@Id
	private String id;

	@Field("date_of_joining")
	private String dateOfJoining;

	@CreatedDate
	@Field("created_on")
	private Date createdOn;

	@LastModifiedDate
	@Field("updated_on")
	private Date updatedOn;

	@Field("is_active")
	private boolean isActive;
	
	@DBRef
	private User user;
	
	@DBRef
	private Department departement;

	public Employee() {

	}

	public Employee(String dateOfJoining, Date createdOn, Date updatedOn, boolean isActive, User user,
			Department departement) {
		super();
		this.dateOfJoining = dateOfJoining;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
		this.user = user;
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dateOfJoining=" + dateOfJoining + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", isActive=" + isActive + ", user=" + user + ", departement=" + departement + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartement() {
		return departement;
	}

	public void setDepartement(Department departement) {
		this.departement = departement;
	}

}
