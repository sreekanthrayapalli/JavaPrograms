package com.myc.sample.threads;

public class MyThreadEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long st= System.currentTimeMillis();
		MyThread t1 = new MyThread();
		t1.val = "hello";
		
		
		MyThread t2 = new MyThread();
		t2.val = "bye";
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
			
		}catch(Exception e){
			
		}
		
		/*t1.run();
		t2.run();
		*/
		long et = System.currentTimeMillis();
		System.out.println(et-st);

		System.out.println("completed..");
	}

}
