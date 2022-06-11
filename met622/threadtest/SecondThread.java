package edu.bu.met622.threadtest;

public class SecondThread implements Runnable{
	@Override
	public void run() {
		for (int j =0; j<100 ; j++) {
			System.out.println("-from SecondThread: ===> j:"+j);
		}
	}
}
