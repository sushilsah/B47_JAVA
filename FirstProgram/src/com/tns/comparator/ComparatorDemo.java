package com.tns.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(222,"sush","bang"));
		st.add(new Student(876,"ddd","mys"));
		st.add(new Student(476,"dsdd","mangs"));
		System.out.println("unsorted array");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
			System.out.println("---------------------");
			Collections.sort(st,new SortByRollno());
			System.out.println("sorting by roll no");
			for(int j=0;j<st.size();j++) {
				System.out.println(st.get(j));
			}
			Collections.sort(st,new SortByName());
			System.out.println("sorting by name");
			for(int p=0;p<st.size();p++) {
				System.out.println(st.get(p));
			}
		}
		

	}

}
