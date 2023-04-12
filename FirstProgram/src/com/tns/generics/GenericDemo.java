package com.tns.generics;

class GenericExample<T>{
	T obj;//generic object
	void add(T obj) {
		this.obj = obj;
	}
	T get() {//generic method
		return obj;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTest<String>  obj = new GenericTest<String>();
		obj.add("hello");
		System.out.println(obj.get());
		GenericTest<Integer>  obj1 = new GenericTest<Integer>();
		obj1.add(3);
		System.out.println(obj1.get());
		

	}

}
