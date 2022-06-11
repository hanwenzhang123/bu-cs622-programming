package edu.bu.met622.threadtest.trylock;

public class MyThread extends Thread{
	
	PrintThread printT;
	MyThread(String name, PrintThread pt){
		super(name);
		this.printT = pt;
	
	}
	@Override
	public void run() {
      System.out.printf(
         "%s starts printing a document\n", Thread.currentThread().getName());
      printT.print();
	}
}
