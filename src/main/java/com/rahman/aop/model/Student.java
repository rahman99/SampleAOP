package com.rahman.aop.model;

public class Student {

	private Integer id;
	private String name;
	
	public Integer getId() {
		System.err.println("ID : "+id);
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		System.err.println("name : "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
