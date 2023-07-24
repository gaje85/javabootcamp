package com.toyota.threads;
public class Main {
    public static void main(String[] args) throws InterruptedException {
    	AtomicIntegerExample counter = new AtomicIntegerExample();

        // Creating two threads that increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        // Joining both threads to wait for their completion before moving on
        thread1.join();
        thread2.join();

        // Output the counter value
        System.out.println("Value: " + counter.getValue());
    }
}
