package com.myc.sample.abstractclasses;

abstract public class Dao {
	
	abstract void getData();

	final void closeConnection(){
		System.out.println("connection is closed..");
	}
}
