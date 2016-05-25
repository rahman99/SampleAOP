package com.rahman.aop.model;

public class Circle {

	private String name;
	private String area;
	
	public String getName() {
		System.out.println("circle name 123");
		System.out.println("circle name 124");
		System.out.println("circle name 125");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		System.out.println("circle area 99 ca");
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
