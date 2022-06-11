package edu.bu.met622.filesnio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleWriteinTextFile {

	public static void main(String[] args) throws Exception {
        String text = "Hello worlddddd ";
        BufferedWriter output = null;
        try {
            File file = new File("exampleeee.txt");
            System.out.println(file.getAbsolutePath());
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            
        } 
        catch ( IOException e ) {
            e.printStackTrace();
        } 
        finally {
          if ( output != null ) {
             output.close();
          }
        }
        
    }
}

