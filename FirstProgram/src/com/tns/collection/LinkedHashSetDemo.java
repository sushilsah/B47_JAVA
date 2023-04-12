package com.tns.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(40);
		lhs.add(20);
		lhs.add(70);
		lhs.add(60);
		lhs.add(30);
		lhs.add(10);
		lhs.add(null);
	    lhs.add(null);
	    lhs.add(null);
	    System.out.println("LinkedHashSet: "+lhs);
	    
	   // Collection.sort(lhs);//CTE- cannot directly sort Hashset/LinkedHashset
	    
	    //sorting using ArrayList/Treeset
	    
	    //Convert LinkedHashSet into ArrayList
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    //sort ArrayList
	    Collections.sort(arr);
	    
	    //Print after sort
	    System.out.println("After sort: "+arr);
	    
		
	}

}
