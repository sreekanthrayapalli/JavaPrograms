package com.myc.sample.threads;

public class Threadtwo extends Thread {
	public void run(){
		
		synchronized (Resources.r2) {
			System.out.println("r1 is locked...t2");
			
			synchronized (Resources.r1) {
				System.out.println("r2 is locked..t2");
			}
			System.out.println("r2 is realised..t2");
		}
		System.out.println("r1 is realised..t2");
	}
}
