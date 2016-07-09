package com.myc.sample.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(10, "abc");
		Employee e2 = new Employee(2, "abc");
		Employee e3 = new Employee(35, "pqr");
		
		SortedSet<Employee> s = new TreeSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		
		Iterator<Employee> ite = s.iterator();
		while(ite.hasNext()){
			Employee e = ite.next();
			e.displayInfo();
		}
		

	}

}
