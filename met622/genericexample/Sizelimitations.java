package edu.bu.met622.genericexample;

public class Sizelimitations <T,U> {

	private T contents;
	private U sizeLimit;
	public Sizelimitations(T contents, U sizeLimit) {
			this.contents = contents;
			this.sizeLimit = sizeLimit; 
	}
}
