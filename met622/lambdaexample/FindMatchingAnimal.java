package edu.bu.met622.lambdaexample;

public class FindMatchingAnimal {
	
	private static void myprint(Animal animal, CheckTrait  trait) { 
	  if(trait.test(animal)) 
	     System.out.println(animal); 
	  } 

	public static void main(String[] args) { 
	   myprint(new Animal("fish", false, true), a -> a.canHop()); // set canhop flag to true false to see the result
	   myprint(new Animal("kangaroo:", true, false), a -> a.canHop()); 
	  } 
	} 
