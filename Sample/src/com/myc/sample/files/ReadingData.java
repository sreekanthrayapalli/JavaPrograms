package com.myc.sample.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("t1.txt");
			
			int a;
			String result = "";
			while((a=fis.read())!= -1){
				char ch = (char)a;
				result  = result+ch;
			}
			
			System.out.println(result);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ie){
			
		}
	}

}
