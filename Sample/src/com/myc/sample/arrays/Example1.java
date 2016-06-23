package com.myc.sample.arrays;

import java.util.Scanner;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter array size");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		
		int a[] = new int[size];
		
		for(int i=0;i<a.length;i++){
			a[i] = i;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
