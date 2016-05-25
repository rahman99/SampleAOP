package com.rahman.aop.model;

public class Shape {

	private Circle circle;
	private Triangle triangle;
	
	public Circle getShapeCircle() {
		System.out.println("shapeCircle");
		return circle;
	}
	public void setCirle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getShapeTriangle() {
		System.out.println("shapeTriangle");
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
