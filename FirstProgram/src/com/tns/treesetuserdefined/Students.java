package com.tns.treesetuserdefined;

public class Students {
	private int marks;
	private String name;
	//adding getter and setter
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//adding to string
	@Override
	public String toString() {
		return "Students [marks=" + marks + ", name=" + name + "]";
	}
	//parameterized constructor
	public Students(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	
	

}
