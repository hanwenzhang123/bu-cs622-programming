package edu.bu.met622.collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class PlaywithSets {
	public static void main(String[] args) {
		NavigableSet<Double> tset = new TreeSet<>();
		for (int i=0; i<= 30; i++) {
			tset.add(Double.valueOf(i));
		}
		System.out.println(tset.ceiling(12.5));
		System.out.println(tset.higher(30.0));
		System.out.println(tset.lower(15.1));
		System.out.println(tset.floor(15.1));
	}}
