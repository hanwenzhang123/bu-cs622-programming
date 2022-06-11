package edu.bu.met622.filesnio;

import java.io.File;

public class ExampleCheckFile {
	public static void main(String[] args) {
		File temp ;
		try {
			temp = File.createTempFile("testttt", ".txt");
			//temp = new File("C:\\data\\ttttest.txt");
			System.out.println("File existed ? Answer:"+ temp.exists());
			System.out.println("--Abs Path--"+temp.getAbsolutePath());
		    System.out.println("--path Path--"+temp.getPath());
			System.out.println("file separator:"+System.getProperty("file.separator"));
			System.out.print("Line separator:"+System.getProperty("line.separator"));
		    if(temp.isFile()) { 
		        System.out.println("File size: "+temp.length()); 
		        System.out.println("File LastModified: "+temp.lastModified()); } 
		      else { 
		    	 System.out.println("File does not exist"); 
		      } // 2nd if 

		} catch (Exception ex){ 
			ex.printStackTrace();
		}
	}
}


