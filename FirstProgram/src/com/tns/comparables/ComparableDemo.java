package com.tns.comparables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",16,720000));
		laps.add(new Laptop("asus",5,720000));
		laps.add(new Laptop("apple",16,920000));
		Collections.sort(laps);
		for(Laptop l:laps) {
			System.out.println(l);
			
		}
		


	}

}
