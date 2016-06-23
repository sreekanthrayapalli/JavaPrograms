package com.myc.sample.constructors;

public class EmployeeEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setValues(101, "abc1", 3000);
		e.displayInfo();
		
		Employee e1 = new Employee(10,"xyz",6000);
		e1.displayInfo();
		
		
		Employee e2 = new Employee(100);

	}

}
