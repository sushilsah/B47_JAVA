package com.tns.interfaces;

public class Rectangle implements Shape {
	private float length;
	private float breadth;
	public Rectangle(float length,float breadth) {//parameterized constructor
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public float calArea() {//implementing abstract method
		// TODO Auto-generated method stub
		float area = length*breadth;
		return area;
	}
	@Override
	public float calPerimeter() {//implementing abstract method
		// TODO Auto-generated method stub
		float perimeter = 2*(length+breadth);
		return perimeter;
	}
	

}
