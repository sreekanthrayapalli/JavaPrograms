package com.myc.sample.threads;

public class ExecutionDead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadOne t1 = new ThreadOne();
		Threadtwo t2 = new Threadtwo();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
