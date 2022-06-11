package edu.bu.met622.threadtest.executoreg;

class First implements Runnable {
     private int i;
     private Counter ctr;
     
     public First(int i, Counter c) {
    	 this.i = i;
         this.ctr = c;
     }
     public void changeCounter(Counter cntr) {
    	 if (i > 0) {
            // synchronized(cntr) {cntr.increment();}
    		 cntr.increment(); //<-- test this what will happen, while we don't use the lock
    	 } 
     }
     public void run() {
        changeCounter(ctr);
     }
}