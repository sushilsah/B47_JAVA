package com.tns.exception;

import java.util.Scanner;

public class TestClass {
	private static int age;
	static void validate() throws Age{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		age = sc.nextInt();
		if (age<10) {
			throw new Age("invalid age, you are not eligible for vote");
			
		}else {
			System.out.println("welcome to vote");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate();
			
		}catch(Exception e) {
			System.out.println("Caught an exception: "+e);
		}

	}

}
