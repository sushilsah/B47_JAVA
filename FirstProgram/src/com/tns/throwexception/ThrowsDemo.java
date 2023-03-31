package com.tns.throwexception;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
static void check()throws ArithmeticException, IOException, SQLException{
	System.out.println("inside check functiom");
	throw new ArithmeticException();
	//throw new IOException();
   //throw new SQLException();
}
}
