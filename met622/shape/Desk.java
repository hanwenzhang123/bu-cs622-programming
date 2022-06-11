package edu.bu.met622.shape;

import java.io.File;

public class Desk implements Shape, Weight {

	double getArea() {
		return 100;
	}	
	double getSize() {
		return 100;
	}
//	double getWeight() {
//		return 100;
//	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		Desk d = new Desk();
		//System.out.println("---->" + d.getW());
	}

	
}
