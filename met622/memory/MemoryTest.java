package edu.bu.met622.memory;

import java.time.Duration;
import java.time.Instant;
import java.util.Vector;

public class MemoryTest {

	public static void main(String[] args){
//		Instant startV = Instant.now();

		Vector v = new Vector();
	    while (true)
	    {
	      byte b[] = new byte[1048576];
	      v.add(b);
	      Runtime rt = Runtime.getRuntime();
	      System.out.println( "free memory: " + rt.freeMemory() );
	    }
	  }
}
