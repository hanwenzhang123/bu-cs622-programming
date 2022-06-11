package edu.bu.met622.threadtest;

//Illustrating join()
public class TestThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				for (int j=0 ; j<100; j++) {
					String a = String.valueOf(System.nanoTime());
					System.out.println("t111111 "+a);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int j=0 ; j<100; j++) {
					String a = String.valueOf(System.nanoTime());
					System.out.println("t222222 "+a);
				}
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				for (int k=0 ; k<100; k++) {
					String a = String.valueOf(System.nanoTime());
					System.out.println("t333333 "+a);
				}
			}
		};
		
		// set the counter value to 10 to see its impact
		t1.start();
		t1.join();
		t2.start();
		//t2.join();
		//t3.join();
		t3.start();

		
		// increase the counter value to 100 to see its impact
		//t1.start();
		//t2.start();
		//t3.start();
		//t2.sleep(1000); 
		
//		Lets comment and uncomment t2.join and see the differences.
		
		System.out.println("End");
	}
}
