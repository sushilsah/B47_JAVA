package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array list
		ArrayList<String> vvit = new ArrayList<String>();
		//System.out.println(vvit);//displaying the arraylist
		vvit.add("sushil");
		vvit.add(null);
		vvit.add("pavan");
		vvit.add("nibid");
		System.out.println(vvit);
        vvit.remove(1);
        System.out.println(vvit);
        //travaversing the list
        for(String ele:vvit) {
        	System.out.println(ele);
        }
        System.out.println("total element "+vvit.size());
        Collections.sort(vvit);
        System.out.println(vvit);
        Collections.reverse(vvit);
        System.out.println(vvit);
        vvit.clear();
        System.out.println(vvit);
        
		
		
		

	}

}
