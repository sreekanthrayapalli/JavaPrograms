package com.myc.sample.abstractclasses;

public class ExecutionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dao obj = new Dao();//error
		Dao obj;
		
		obj = new MysqlDao();

		obj.getData();
		
		obj = new SqlServerDao();
		
		obj.getData();
	}

}
