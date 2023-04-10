package com.tns.comparator;

public class Student {
	int rollno;
	String name, Address;
	
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.Address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", Address=" + Address + "]";
	}
	
	

}
