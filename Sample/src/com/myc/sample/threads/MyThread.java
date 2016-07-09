package com.myc.sample.threads;

public class MyThread extends Thread{
	public String val;
	public void run(){
		
		System.out.println("Thread is executed my values...");
		
		for(int i=0;i<10;i++){
			System.out.println(val);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
