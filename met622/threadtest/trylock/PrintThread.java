package edu.bu.met622.threadtest.trylock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintThread {
	   private final Lock queueLock = new ReentrantLock();

	   public void print() {
	      queueLock.lock();

	      try {
	         Long duration = (long) (Math.random() * 3000); // Play with this duration to show lock changes 
	         System.out.println(Thread.currentThread().getName() + " Time Taken " + (duration / 1000) + " secs.");
	         Thread.sleep(duration);
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      } finally {
	         System.out.printf(
	            "%s printed the document successfully.\n", Thread.currentThread().getName());
	         queueLock.unlock();
	      }
	   }
}

