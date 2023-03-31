package com.tns.throwexception;

public class ThrowDemo {
	static void avg() {
		System.out.println("avg is throwing exception: ");
//		ArithmeticException ae = new ArithmeticException();
//		throw ae;
		throw new ArithmeticException("done");
	}
}
