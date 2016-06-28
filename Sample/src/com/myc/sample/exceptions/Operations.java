package com.myc.sample.exceptions;


//p1
public class Operations {

	public void div(String input1,String input2) throws ArithmeticException,NumberFormatException{
		
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		int c = a/b;
		System.out.println("div is "+c);
	}
	
	public void sum(String input1,String input2) throws ArithmeticException,NumberFormatException{
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		
		if(a==0 || b==0){
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
		
		if(a== 1){
			NumberFormatException ne = new NumberFormatException();
			throw ne;
		}
		
		int c = a+b;
		System.out.println("sum is "+c);
	}
}
