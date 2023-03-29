package com.tns.nestedcatch;
/*
 * Program  demonstrate nested catch 
 */

public class NestedcatchDemo {
	int arr[] = new int[4];//Declare an array
	void nestedCatch() {
		try {
			String str= null;
			str.equals("hai");
			//arr[3]=20/0;//Arithemetic exception occur
			//arr[10]= 5;//Array outof bound exception
			System.out.println("try block");
		}
		catch(ArithmeticException a) {
			System.out.println("a number cannot be divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("accessing array elements outside specified limit"+e);
			
		}
		catch( Exception e) {
			System.out.println("no exception match");
		}
	}
	

}
