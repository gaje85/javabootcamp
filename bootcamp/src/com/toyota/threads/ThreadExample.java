package com.toyota.threads;

public class ThreadExample extends Thread {

	public ThreadExample() {
		
	}
	
	
	public void run() {
		for(int i=0;i<10;i++) {
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("i = "+i+" thread name "+Thread.currentThread());
		}
	}
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.setName("one");
		te.start();
		
		ThreadExample te1 = new ThreadExample();
		te1.setName("two");
		te1.start();
	}
}
