package com.tns.lambdaexpression;

public class LambdaWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 5;
		Cube c = (int a)-> {
			return(a*a*a);
		};
	int res = c.calculate(b);
	System.out.println(res);

	}

}
