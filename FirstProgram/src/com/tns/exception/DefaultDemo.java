package com.tns.exception;

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = null;
		try {
			a.equals("hello");
			
		}
		catch(Exception e) {
			System.out.println("null pointer exception");
			
		}
	}

}
