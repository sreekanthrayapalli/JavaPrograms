package com.myc.sample.threads;

import java.util.Random;

public class Producer extends Thread{
	Util obj;
	public Producer(Util obj) {
		this.obj = obj;
	}
	
	public void run(){
		
		for(int i=0;i<10;i++){
			int val = new Random().nextInt(50);
			obj.set(val);
			System.out.println("Producer generated value "+val);
		}
	}

}
