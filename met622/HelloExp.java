package edu.bu.met622;

import java.io.*;
public class HelloExp {
	public static void main (String[] args) {
//		try {
//			int i=10;
//			//System.out.println(i/0);
//			System.out.println("Here will never reach");
//			throw new NoClassDefFoundError();
//		}catch(Exception ex1) {
//			System.out.println("exception happened 1:"+ex1.getMessage());
//			ex1.printStackTrace();
//		}catch(NoClassDefFoundError ex2) {
//			System.out.println("exception happened 2:"+ex2.getMessage());
//			ex2.printStackTrace();
//		}
//		finally {
//			System.out.println("Always here will be printed");
//		}
		File temp;
		try {
			temp = File.createTempFile("xxxxx", ".log");
			System.out.println(" Is file existed:"+temp.exists());
			System.out.println(" File path:"+temp.getAbsolutePath());
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
