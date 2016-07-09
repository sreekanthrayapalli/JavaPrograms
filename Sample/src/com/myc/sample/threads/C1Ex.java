package com.myc.sample.threads;

public class C1Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		Thread t1 = new Thread(obj);
		t1.start();

	}

}
