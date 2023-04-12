package com.tns.generics;

public class GenericTest <T>{
	T obj;
	void add(T obj) {//generic method
		this.obj = obj;
	}
	T get() {
		return obj;
	}

}
