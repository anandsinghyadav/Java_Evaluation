package com.question_4;

public class ThreadA extends Thread {
	
	ThreadC c;
	
	public ThreadA(ThreadC ob) {
		// TODO Auto-generated constructor stub
		this.c = ob;
	}
	
	// kohli Thread
	@Override
	public void run() {
		
		  try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  String name = Thread.currentThread().getName();
		  System.out.println(name+" thread is stated");
		for(int i=1;i<=10;i++) {
			System.out.println(name+" is running "+i);
		}
		System.out.println(name+" is ended");
	}
	

}
