package com.example.restservice;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	@NotNull(message = "Id is required")
	private Integer id;
	@NotEmpty(message = "Name is required")
	@Size(min=10,message="Name should be minimum 10 characters") 
	private String name;
	@NotNull(message = "Age is required")
	private Integer age;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
