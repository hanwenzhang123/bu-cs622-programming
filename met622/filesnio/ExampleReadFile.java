package edu.bu.met622.filesnio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleReadFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("/Users/rawassizadeh/WORK/eclipseworkspace/CSMET622/exampleeee.txt");
		System.out.println(File.separator);
		BufferedReader br = new BufferedReader(new FileReader(f)); 
		String st; 
		while ((st = br.readLine()) != null) 
		    System.out.println("-----> "+st);  				
	}
}

