package edu.bu.met622.lambdaexample;
import java.util.ArrayList; 

/**
 * adapted from here: https://www.geeksforgeeks.org/lambda-expressions-java-8/
 * http://tutorials.jenkov.com/java/lambda-expressions.html
 * 
 */
public class SecondLambdaExample {
	// A Java program to demonstrate simple lambda expressions 
	    public static void main(String args[]) 
	    { 
	        // Creating an ArrayList with elements 
	        // {1, 2, 3, 4} 
	        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
	        arrL.add(11); 
	        arrL.add(22); 
	        arrL.add(99); 
	        arrL.add(40); 
	        arrL.add(56); 
	        arrL.add(60); 
	        arrL.add(72);
	     
	        // Using lambda expression to print all elements  of arrL 
	        arrL.forEach(n -> System.out.println("just print them:"+n)); 
	  
	        // Using lambda expression to print even elements of arrL 
	        arrL.forEach(m -> { if (m%2 == 0) System.out.println("m is:"+m); }); 
	    } 
}
