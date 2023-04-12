package com.tns.vector;

import java.util.Vector;

public class VectorDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a new vector 
		Vector<String> vt = new Vector<String>();
		//adding element to vector
		vt.add("sushil");
		vt.add("sah");
		vt.add("mosh");
		vt.add("john");
		vt.add("sarah");
		vt.add(null);
		
		System.out.println(vt);//print element of vector
		
		//insert an element at index
		vt.insertElementAt( "mosh",0);
		vt.insertElementAt("penkak", 3);
	
		//remove the element at index 1
		vt.removeElementAt(1);
		vt.removeElementAt(4);
		
		System.out.println(vt.elementAt(1));//printing the capacity of vector
		
		System.out.println(vt.capacity());//capacity of vector
		
		System.out.println(vt);
		
		vt.clear();//deleting the element from vector
		System.out.println(vt);
		

	}

}
