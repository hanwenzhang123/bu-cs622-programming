package edu.bu.met622.filesnio;

import java.io.File;
import java.io.IOException;
import java.sql.Time;

public class FileCheck {
	public static void main(String[] args) throws Exception {
		System.out.println("file separator in my OS:" +System.getProperty("file.separator")); 

		File temp ;
		try {
			temp = File.createTempFile("testttt", ".txt");
			System.out.println("File existed? "+temp.exists());
			System.out.println("Absolute path "+temp.getAbsolutePath());
			System.out.println("Path "+temp.getPath());
			
			long a = Long.parseLong("8466273930542618974");
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
		
	}
}
