package com.myc.sample.threads;


public class Printer {
	public synchronized void print(String s){
		
		
		for(int i=0;i<=10;i++){
			System.out.println(s);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}