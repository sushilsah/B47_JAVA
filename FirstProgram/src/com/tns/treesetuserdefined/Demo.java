package com.tns.treesetuserdefined;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Students> set = new TreeSet<Students>();
		set.add(new Students(12,"rosy"));
		set.add(new Students(13,"john"));
		set.add(new Students(14,"mosh"));
		set.add(new Students(15,"smith"));
		System.out.println("increasing order with marks");
		
		//Printing the treeset elements
		for(Students ele:set) {
			System.out.println(ele.getName()+" "+ele.getMarks());
			System.out.println();
			
		}
		

	}

}
