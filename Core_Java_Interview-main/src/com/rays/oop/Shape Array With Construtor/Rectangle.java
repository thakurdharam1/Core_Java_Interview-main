package com.rays.construtor;

public class Rectangle extends Shape {
	
	public double length;
	public double width;

	public Rectangle(double length, double width) {
		// super();
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

}
