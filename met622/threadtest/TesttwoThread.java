package edu.bu.met622.threadtest;

import edu.bu.met622.threadtest.FirstThread;
import edu.bu.met622.threadtest.SecondThread;

public class TesttwoThread {
	public static void main(String[] args) throws Exception{
		FirstThread firstT = new FirstThread() ;
		Thread i = new Thread(firstT);
		
		SecondThread secondT = new SecondThread();
		Thread j = new Thread(secondT);
		i.sleep(3000);
		i.start();
		//i.join(); // j is for second thread
		j.start();
		
		//i.sleep(5000);
//		for (int k=0 ; k<100; k++) {
//			System.out.println("ssss: "+k);
//		}
		
	}
}
