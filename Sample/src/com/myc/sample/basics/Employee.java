package com.myc.sample.basics;

public class Employee {
	
	private int empno;
	private String ename;
	
	
	public void displayInfo(){
		System.out.println(empno+"   "+ename);
	}
	
	public void setValues(int a,String b){
		empno = a;
		ename = b;
	}
	
	public static void getOffficeInfo(){
		System.out.println("Hyderabad,TG,500070");
	}

}
