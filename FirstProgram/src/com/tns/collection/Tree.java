package com.tns.collection;

import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i>0;i--) {
			set.add(i);
			
		}
		for(int i: set) {
			System.out.println(i);
		}

	}

}
