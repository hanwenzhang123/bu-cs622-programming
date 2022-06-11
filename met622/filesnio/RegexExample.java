package edu.bu.met622.filesnio;
import java.util.regex.*;

public class RegexExample {
	public static void main(String[] args) {
		
		String txt= "This is a sample text used for Java regular expression.";
		
		// Create a Pattern object
		Pattern p = Pattern.compile(".ext"); 
		//Pattern p = Pattern.compile("fo..");
		//Pattern p = Pattern.compile("\\b");
		
		// Get a matcher object
	    Matcher m = p.matcher(txt);   

	    int count = 0;
			
	    while(m.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	    }
	}
}
