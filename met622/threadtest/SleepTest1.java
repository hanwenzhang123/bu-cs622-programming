package edu.bu.met622.threadtest;

public class SleepTest1 {
	public static void main(String args[]) throws InterruptedException {
		String importantInfo[] = { "msg 1", "msg 2", "msg 3", "msg 4", "msg 5", "msg 6" };
		for (int i = 0; i < importantInfo.length; i++) {
			// Pause for 2 seconds
			Thread.sleep(2000);
			// Print a message
			System.out.println(importantInfo[i]);
		}
	}
}
