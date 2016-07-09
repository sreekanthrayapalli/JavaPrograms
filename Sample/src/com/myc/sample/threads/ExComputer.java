package com.myc.sample.threads;

public class ExComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer();
		Printer p2 = new Printer();
		Computer c1 = new Computer(p1, "Hello");
		Computer c2 = new Computer(p2, "Bye");

		/*c1.start();
		c2.start();*/
		c1.run();
		c2.run();
	}

}
