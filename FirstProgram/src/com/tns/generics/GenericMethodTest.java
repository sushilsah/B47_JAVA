package com.tns.generics;

public class GenericMethodTest {
	
	public <E> void displayArrayElement(E[] elements) {
		for(E ele:elements) {
			System.out.println("elements are: "+ele);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericMethodTest obj = new GenericMethodTest();
		Integer[] intarr = {10,20,30};
		String[] strarr = {"java","program"};
		obj.displayArrayElement(intarr);
		obj.displayArrayElement(strarr);
		

	}

}
