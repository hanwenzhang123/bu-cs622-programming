package edu.bu.met622.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
 public static void main(String[] args) {
	 Map<String, String> map = new TreeMap<>(); //TODO: try this one as well Hashmap<>()
	 map.put("koala", "bamboo"); 
	 map.put("lion", "meat"); 
	 map.put("giraffe", "leaf"); 
	 String food = map.get("koala"); // bamboo 
	 System.out.println("-====>"+food);
	 
	 for (String key: map.keySet()) 
	    System.out.print(key + ","); // koala,giraffe,lion, 	 
 }
 
// public void sss(){
//	 int counter = 0;
//	 while (4<5) {
//		 System.out.println("----");
//		 if (counter >4) break;
//		 counter ++;
//	 }
// }
 
}
