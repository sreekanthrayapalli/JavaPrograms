package com.myc.sample.basics;

public class MyFirstProgram {

	public static void main(String arg[]){
		
		System.out.println("hello world...");
		
		System.out.println("Bye...");//syso
		
		//create employee object
		
		Employee e1 = new Employee();
		e1.displayInfo();
		
		e1.setValues(10, "abc");
		
		e1.displayInfo();
		Employee.getOffficeInfo();
		
		e1.getOffficeInfo();
	}
}
