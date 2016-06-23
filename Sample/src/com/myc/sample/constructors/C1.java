package com.myc.sample.constructors;

public class C1 {
	
	C1(){
		System.out.println("this is default..");
	}
	
	C1(int a){
		this();
		System.out.println("this is parameter...");
	}
	
	C1(int a,int b){
		this();
		System.out.println("this is two parameter...");
	}

}
