package com.tns.exception;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d= 0,a; 
		 
		 try 
		 {
			 a=22/d;//exception occured
			 
		 
		System.out.println("This will not print");
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Division by zero");
			 
		 }
		 System.out.println("This will be printed");

	}

}
