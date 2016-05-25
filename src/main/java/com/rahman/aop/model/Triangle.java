package com.rahman.aop.model;

public class Triangle {

	private String name;
	private String area;
	
	public String getName() {
		System.out.println("test123");
		System.out.println("test124");
		System.out.println("test125");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
