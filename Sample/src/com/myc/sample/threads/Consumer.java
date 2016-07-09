package com.myc.sample.threads;

public class Consumer extends Thread{
	
	 Util obj;
	 
	 public Consumer(Util obj) {
		 	this.obj = obj;
	 }
	public void run(){
		for(int i =0;i<10;i++){
			int val = obj.get();
			System.out.println("Consumer got value "+val);
		}
	}

}
