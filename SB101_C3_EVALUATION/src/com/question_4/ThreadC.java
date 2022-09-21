package com.question_4;

public class ThreadC extends Thread{
	ThreadB b;
	
	public ThreadC(ThreadB ob) {
		// TODO Auto-generated constructor stub
		this.b = ob;
	}
	int product =1;
	
	@Override
	public void run() {
		
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       String name = Thread.currentThread().getName();
       
       System.out.println(name+" thread is started.");
		for(int i=1;i<=10;i++) {
			product*=i;
		}
		System.out.println("Product is "+product);
		System.out.println(name+" is ended.");

	}
	
	

}
