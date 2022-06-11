package edu.bu.met622.threadtest;

public class FirstThread implements Runnable{

	@Override
	public void run() {
		for (int i =0; i<100 ; i++) {
			System.out.println("-from FirstThread: ----> i:"+i);
		}
	}
	
}
