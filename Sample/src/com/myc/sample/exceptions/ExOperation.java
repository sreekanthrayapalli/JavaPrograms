package com.myc.sample.exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExOperation {

	/**
	 * @param args
	 */
	
	//p2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations ope = new Operations();
		
		//take input values from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two input values...");
		
		String input1 = sc.next();
		String input2 = sc.next();
		
		
		//ope.div(input1, input2);
		
		ope.sum(input1, input2);
	}

}
