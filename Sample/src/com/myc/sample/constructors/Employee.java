package com.myc.sample.constructors;

public class Employee {

	int empno;
	String ename;
	int sal;

	public Employee() {
		empno = 100;
		ename = "abc";
		sal = 5000;
	}

	public Employee(int empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public Employee(int empno){
		this.empno = empno;
	}
	
	public void setValues(int empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public void displayInfo() {
		System.out.println(empno + "   " + ename + "  " + sal);
	}
}
