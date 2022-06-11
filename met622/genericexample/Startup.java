package edu.bu.met622.genericexample;

import java.util.ArrayList;
import java.util.*;

public class Startup {
	public static void main(String[] args) {
		
		Vehicle toyota = new Vehicle (); 
		Integer numPounds = 15000;
		Sizelimitations<Vehicle, Integer> c1 = new Sizelimitations<>(toyota, numPounds);
		
		Envelope bankcheck = new Envelope ();
		Number weight = 10;
		Sizelimitations<Envelope, Number> c2 = new Sizelimitations<>(bankcheck, weight);
		
	}
	// static ArrayList <E> = new ArrayList();
	
	
}
