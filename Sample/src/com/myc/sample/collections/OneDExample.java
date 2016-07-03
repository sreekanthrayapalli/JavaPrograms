package com.myc.sample.collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import java.util.List;


import java.util.Set;


public class OneDExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1 = new ArrayList();
		
		//Set l = new HashSet();
		
		boolean b = l1.add(10);
		System.out.println(b);
		b = l1.add(new Integer(20));
		System.out.println(b);
		
		b = l1.add(10);
		
		System.out.println(b);
				
		System.out.println(l1.size());
		
		
		LinkedList l2 = new LinkedList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.addAll(l2);
		
		System.out.println(l1);
		
		l1.remove(new Integer(3));		

		System.out.println(l1);
		
		HashSet l3 = new HashSet<>();
		l3.add(10);
		l3.add(11);
		l3.add(12);
		
		
		
		DisplayElements.displayOdd(l1);
		DisplayElements.displayOdd(l2);
		
		DisplayElements.displayOdd(l3);
		
		Iterator ite = l1.iterator();
		int j= (int) l1.get(0);
		while(ite.hasNext()){
			int i = (int) ite.next();
			System.out.println(i);
		}
		
		ListIterator lite = l1.listIterator();
		System.out.println("forward direction..");
		while(lite.hasNext()){
			int k = (int) lite.next();
			System.out.println(k);
			
		}
	
		System.out.println("backward direction");
		while(lite.hasPrevious()){
			int k = (int)lite.previous();
			System.out.println(k);
		}
	
	}

}
