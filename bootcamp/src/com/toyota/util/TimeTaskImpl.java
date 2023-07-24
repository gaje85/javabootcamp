package com.toyota.util;

import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskImpl  {
	
	
	public TimeTaskImpl() {
		
		TimerTask tt = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Timer Task called "+Thread.currentThread());
				
			}
		};
		Timer timer = new Timer();
		timer.schedule(tt, 5000, 3000);
	}
	
  public static void main(String[] args) {
	TimeTaskImpl impl = new TimeTaskImpl();
}
}
