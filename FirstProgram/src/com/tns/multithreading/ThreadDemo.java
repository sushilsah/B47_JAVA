package com.tns.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CreatingThreadOne t = new CreatingThreadOne();
//		t.start();//implicitly calling run method
//		t.start();
//		t.run();//explicitly calling the run method
		//create an object of the my class and pass that object to thread class
		CreatingThreadSecond t1 = new CreatingThreadSecond();
		Thread th = new Thread(t1);
		th.run();
		th.run();

	}

}
