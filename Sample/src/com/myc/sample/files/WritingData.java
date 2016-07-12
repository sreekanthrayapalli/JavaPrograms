package com.myc.sample.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=null;
		try{
		//	
			 fos = new FileOutputStream("t1.xls",true);
			String s = "hello world..";
			byte []b = s.getBytes();
			fos.write(b);
			System.out.println("file saved ..");
			
		}catch(FileNotFoundException fe){
			System.err.println("Please proper location and proper file name");
		}catch(IOException io){
			System.err.println("there is some problem to write data");
		}finally{
			try {
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
		}

	}

}
