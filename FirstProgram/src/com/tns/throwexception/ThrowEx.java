package com.tns.throwexception;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
try {
	ThrowsDemo.check();
}
catch(ArithmeticException e) {
	System.out.println("caught the exe");
}
catch(SQLException e1) {
	System.out.println("IOnException");
}catch(IOException e2) {
	System.out.println("SQLException");
}
	}

}
