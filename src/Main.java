import java.util.*;

public class Main {
    private static RandomGenome genome = new RandomGenome();
    private static Thread thread1 = new Thread(genome);
    private static Thread thread2 = new Thread(genome);
    private static Thread thread3 = new Thread(genome);
    private static Thread thread4 = new Thread(genome);
    private static Thread thread5 = new Thread(genome);
    public static void main(String[] args) {
        System.out.println("----------Single-Threaded Example----------");
        long singleStartTime = System.currentTimeMillis();
        genome.sequence(100);
        long singleStopTime = System.currentTimeMillis();
        long singleDuration = singleStopTime - singleStartTime;
        System.out.println("Running the program using single threaded method in " + singleDuration + " in milliseconds." );

        System.out.println("\n----------Multi-Threaded Example----------");
        long multiStartTime = System.currentTimeMillis();
//        start() runs the thread, will start a new thread and the JVM assigns it to a CPU core.
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        long multiStopTime = System.currentTimeMillis();
        long multiDuration = multiStopTime - multiStartTime;
        System.out.println("Running the program using multi threaded method in " + multiDuration + " in milliseconds." );

//        join() allows the calling thread to wait until another thread gets its task done => Waiting threads to finish completely
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            long multiStopTimeAll = System.currentTimeMillis();   //get the end time when all the threads are finished completely
            long multiDurationAll = multiStopTimeAll - multiStartTime;
            System.out.println("**Running the program using multi threaded method in " + multiDurationAll + " in milliseconds.**" );
        } catch(InterruptedException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
