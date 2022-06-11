package edu.bu.met622.collections;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class TestPerformance {
  public static void main(String[] args) {
	  Instant startV = Instant.now();
	  Vector<Integer> a = new Vector();
	  for (int i=0; i<1000000; i++) {
		  a.add(i);
	  }
	  Instant stopV = Instant.now();
	  System.out.println("--vector--->"+Duration.between(startV, stopV).getNano());
//////
	  Instant startQ = Instant.now();
	  ArrayDeque c = new ArrayDeque(20);
	  for (int k=0; k<1000000; k++) {
		  c.add(k);
	  }
	  Instant stopQ = Instant.now();
	  System.out.println("--arrayDeque--->"+Duration.between(startQ, stopQ).getNano());
////// 
	  Instant startA = Instant.now();
	  ArrayList b = new ArrayList();
	  for (int j=0; j<1000000; j++) {
		  b.add(j);
	  }
	  Instant stopA = Instant.now();
	  System.out.println("--arraylist--->"+Duration.between(startA, stopA).getNano());
//////	
	  Instant startHM = Instant.now();
	  Map<String, String> map = new HashMap<>();
	  for (int k=0; k<1000000; k++) {
			 map.put(String.valueOf(k), "x"); 
	  }
	  Instant stopHM = Instant.now();
	  System.out.println("--HashMap--->"+Duration.between(startHM, stopHM).getNano());
////////	  
	  Instant startTM = Instant.now();
	  Map<String, String> tmap = new TreeMap<>();
	  for (int k=0; k<1000000; k++) {
			 tmap.put(String.valueOf(k), "x"); 
	  }
	  Instant stopTM = Instant.now();
	  System.out.println("--TreeMap--->"+Duration.between(startTM, stopTM).getNano());
	   
  }
}
