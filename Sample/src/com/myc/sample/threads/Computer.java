package com.myc.sample.threads;

public class Computer{
	
	Printer p;
	String msg;
	
	public Computer(Printer p,String msg){
		this.p = p;
		this.msg = msg;
	}
	
	public void run(){
		p.print(msg);
	}

}
