package com.myc.sample.exceptions;

import java.util.Scanner;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values..");
		String input1 = sc.next();
		String input2 = sc.next();

		
			try{
			System.out.println("begin");
			int a = Integer.parseInt(input1);

			int b = Integer.parseInt(input2);
			int c = a / b;
			
			System.out.println(c);
			}catch(ArithmeticException ae){
				System.out.println("donot give zero second..value");
			}
			catch(Exception e){
				System.out.println("oops.. something wrong.. please try again...");
				e.printStackTrace();
				//System.out.println(e);
			}
			
		
		


	}

}
