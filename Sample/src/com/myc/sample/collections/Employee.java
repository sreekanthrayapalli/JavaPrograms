package com.myc.sample.collections;

public class Employee implements Comparable<Employee>{

	private int empno;
	private String ename;

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public void displayInfo() {
		System.out.println("Empno is " + empno + "  ename is " + ename);
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (empno == e.empno && ename.equals(e.ename))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode(){
		return empno*200;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return empno-o.empno;
	}

}
