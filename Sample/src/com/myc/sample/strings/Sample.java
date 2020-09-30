package com.myc.sample.strings;

import java.util.StringTokenizer;


public class Sample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s = "hi,hello,how,are,you";
			String []sp = s.split(" ");
			for(int i=0;i<sp.length;i++){
				System.out.println(sp[i]);
				//done
			}
			
			StringTokenizer st = new StringTokenizer(s,",");
			while(st.hasMoreElements()){
				System.out.println(st.nextElement());
			}
		
	}

}
