package edu.bu.met622.threadtest;

public class TestThreadPolling {

	private static int counter = 0;
	public static void main(String[] args) throws InterruptedException{
		new Thread(() -> {for(int i=0; i<500; i++) 
						   TestThreadPolling.counter++;
						   System.out.println("inside thread:"+ counter);
		                 }).start();
			while(TestThreadPolling.counter<100) { 
				System.out.println("Not reached yet, counter:" +TestThreadPolling.counter);
				Thread.sleep(1000); // 1 SECOND
			}
		System.out.println("Reached!"); 
	}
}