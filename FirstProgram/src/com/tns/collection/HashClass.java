package com.tns.collection;

import java.util.HashSet;

public class HashClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();//an empty hasset
		//Adding element of hashset
		hs.add("monkey");
		hs.add("tiger");
		hs.add("lion");
		hs.add("parrot");
		hs.add("cow");
		System.out.println("No order will be maintained "+hs);
		
		//adding duplicate element that will ignored
		hs.add("monkey");
		hs.add("lion");
		hs.add("cow");
		System.out.println("No of duplicate element "+hs);
		
		//Adding of null element
		hs.add(null);
		hs.add(null);
		System.out.println("Unoredered and No Duplicate hashset element");
		System.out.println(hs);
		

	}

}
