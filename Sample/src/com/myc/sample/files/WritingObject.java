package com.myc.sample.files;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WritingObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * FileOutputStream fos = new FileOutputStream("objects.txt");
		 * 
		 * ObjectOutputStream oos = new ObjectOutputStream(fos);
		 */

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"objects.txt"));
		
		
		Employee e1 = new Employee();
		e1.setEmpno(100);
		e1.setEname("abc");
		
		oos.writeObject(e1);//object has been saved into file
		
		oos.close();
		System.out.println("completed....");
	

	}

}
