package com.toyota.threads;

public class RunnableExample implements Runnable{

	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i = "+i+" thread name "+Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		RunnableExample re = new RunnableExample();
		Thread thread1 = new Thread(re);
		thread1.setName("one");
		thread1.start();
	}
}
