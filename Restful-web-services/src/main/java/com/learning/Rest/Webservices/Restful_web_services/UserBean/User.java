package com.learning.Rest.Webservices.Restful_web_services.UserBean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {

	private Integer userId;
	
	@JsonProperty("User_Name")
	@NotEmpty
	@Size(min = 2, message = "Name should at least have 2 char")
	private String name;
	
	@Past(message = "birthday should be  in past")
	private LocalDate birthday;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public User(Integer userId, String name, LocalDate birthday) {
		super();
		this.userId = userId;
		this.name = name;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birthday=" + birthday + "]";
	}  
	
	
	
}
