package com.myc.sample.files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.txt"));
		Object obj = ois.readObject();
		
		
		Employee e1 = (Employee)obj;
		
		System.out.println(e1.getEmpno()+"   "+e1.getEname());
		ois.close();

	}

}
