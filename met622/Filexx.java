package edu.bu.met622;

public class Filexx { 
	  public static void main(String[] args) { 
	     StringBuilder sb = new StringBuilder("Hello"); 
	     System.out.println(sb);
	     
	     sb.append(" My "); 
	     sb.append("Friend!"); 
	     System.out.println(sb); 
	    
	     sb.insert(9, "New "); 
	     System.out.println(sb); 
	     sb.delete(6, 9); 
	     System.out.println(sb); 
	     sb.deleteCharAt(11); 
	     System.out.println(sb); 
	     sb.replace(10, 15, "Neighbor"); 
	     System.out.println(sb); 
	     sb.reverse(); 
	     System.out.println(sb); 
	     } 
	} 
