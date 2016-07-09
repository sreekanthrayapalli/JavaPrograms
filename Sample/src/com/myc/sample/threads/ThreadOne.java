package com.myc.sample.threads;

public class ThreadOne extends Thread{
	
	public void run(){
		
		synchronized (Resources.r1) {
			System.out.println("r1 is locked...t1");
			
			synchronized (Resources.r2) {
				System.out.println("r2 is locked..t1");
			}
			System.out.println("r2 is realised..t1");
		}
		System.out.println("r1 is realised..t1");
	}

}
