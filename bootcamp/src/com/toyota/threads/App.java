package com.toyota.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

    private int id;
    int total = 0;

    public Processor(int id) {
        this.id = id;
    }

    public void run() {
       for(int i=0;i<id;i++) {
    	   total = total + id;
       }
       System.out.println(Thread.currentThread());
    }
}

public class App {

    public static void main(String[] args) {
        /**
         * Created 2 threads, and assign tasks (Processor(i).run) to the threads
         */
        ExecutorService executor = Executors.newFixedThreadPool(1500);//2 Threads
       // ExecutorService executor = Executors.newWorkStealingPool();
        
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) { // call the (Processor(i).run) 2 times with 2 threads
            executor.submit(new Processor(i));
        }
        executor.shutdown();
        System.out.println("All tasks submitted.");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ignored) {
        }
        long end = System.currentTimeMillis();
        System.out.println("All tasks completed."+(end-start));
    }
}