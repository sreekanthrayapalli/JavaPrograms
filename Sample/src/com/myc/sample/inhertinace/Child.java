package com.myc.sample.inhertinace;

//sub class/derived class/child class
public class Child extends Parent{

	String name="child";
	public void dance(){
		System.out.println("dancing..");
	}
	public void sing(){
		System.out.println("sing with music");
	}
	
	public void start(){
		sing();
		super.sing();
		dance();
		System.out.println(name+"   "+super.name);
	}
}
