package com.tns.collection;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<Integer>();//creating wrapper class object i.e st
		
		
		//Push operation
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);;
		st.push(4);
		st.push(100);
		st.add(77);
		System.out.println("Element in the stack is "+st);
		
		//pop element
		st.pop();
		st.pop();
		
		// for each
		for(int temp:st) {
			System.out.println(temp);
		}
		//peek() is used to print the last element of stack
		System.out.println("last of element is: "+st.peek());
		
		//search of the stack
		if(st.isEmpty()) {
			System.out.println("stack is empty ");
			
		}
		else {
			System.out.println("stack is not empty ");
			
		}
		//search of element
		System.out.println(st.search(0));
		System.out.println(st.search(100));
	}

}
