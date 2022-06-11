package edu.bu.met622.collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeqExample {
   public static void main(String[] args) {
	   
      // Create an empty array dequeue with an initial size 4
      Deque<Integer> deque = new ArrayDeque<Integer>(0);
      // Use add() method to add elements into the deque
      deque.add(1);
      deque.add(2);
      deque.add(3);
      deque.add(4);        
      deque.add(5);
      deque.add(6);         

      // Print all the elements of deque
      for (Integer n : deque) {
         System.out.println(n);
      }
      System.out.println("--x---");

      deque.removeLast(); 
      // Print all the elements of deque
      for (Integer n : deque) {
         System.out.println(n);
      }
      System.out.println("--x-x--");
      deque.removeFirst();
      // Print all the elements of deque
      for (Integer n : deque) {
         System.out.println(n);
      }
   }
}

