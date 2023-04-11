package com.tns.vector;

import java.util.Vector;

public class VectorDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a new vector 
		Vector<Integer> vt = new Vector<Integer>();
		//adding element to vector
		vt.add(5);
		vt.add(9);
		vt.add(10);
		vt.add(11);
		
		System.out.println(vt);//print element of vector
		
		//insert an element at index
		vt.insertElementAt(0, 3);
		
		//remove the element at index 1
		vt.removeElementAt(1);
		
		System.out.println(vt.elementAt(2));//printing the capacity of vector
		
		System.out.println(vt.capacity());//capacity of vector
		
		System.out.println(vt);
		
		vt.clear();//deleting the element from vector
		System.out.println(vt);
		

	}

}
