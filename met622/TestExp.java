package edu.bu.met622;

import java.io.File;
import java.io.IOException;

public class TestExp {
	public static void main(String[] args) {
		
//		try {
//			int i = 10;
//			System.out.println(i/0);
//		} catch (Exception ex) {
//			System.out.println("Error in Try block:" + ex.getMessage());
//			ex.printStackTrace();
//		} 
////		
	
		try {
			throw new IOException(); 
		}
		catch (IOException ex) {
			System.out.println("exception caught and processed in m1()"); 
		}
		finally {
			System.out.println("good bye");
		}
	}
	
	public void test() throws Exception {
		
	
	}
}
	
