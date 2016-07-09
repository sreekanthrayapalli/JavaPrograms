package com.myc.sample.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(1, "abc");
		Employee e3 = new Employee(3, "pqr");

		Set<Employee> l = new HashSet<>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		System.out.println(e1.hashCode()+"   "+e2.hashCode()+"   "+e3.hashCode());
		if(e1.equals(e2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

		Iterator<Employee> ite = l.iterator();
		while (ite.hasNext()) {
			
				Employee e = ite.next();
				e.displayInfo();
			
		}

	}

}
