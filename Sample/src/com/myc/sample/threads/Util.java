package com.myc.sample.threads;

public class Util {
	
	private boolean flag = true;
	private int val;
	
	public synchronized void set(int i){
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.val = i;
		flag = false;
		notify();	
		
	}

	public synchronized int get(){
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = true;
		notify();
		return val;
		
	}
}
