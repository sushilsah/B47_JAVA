package com.tns.collection;

import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		for(int i = 5;i > 0; i--) {
			lh.add(i);
		}
		for(int i:lh) {
			System.out.println(i);
		}

	}

}
