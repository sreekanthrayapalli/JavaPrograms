package com.myc.sample.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Driver d = new OracleDriver();
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
			
			Statement st  = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from emp");
			
			while(rs.next()){
				String c1 = rs.getString(1);//1st column result
				String c2 = rs.getString(2);//2st column result
				String c3 = rs.getString(3);
				System.out.println(c1+"   "+c2+"  "+c3);
			}
			
			con.close();
			
			
			 
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
