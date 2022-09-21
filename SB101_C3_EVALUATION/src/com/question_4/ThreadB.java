package com.question_4;

public class ThreadB extends Thread{
	
 
	int sum=0;
	
	@Override
	public void run() {
		
		   
	      String name = Thread.currentThread().getName();
	      System.out.println(name+" is started");
	      
		for(int i=0;i<=20;i++) {
			sum+=i;
		}
		System.out.println("Sum is "+sum);
		System.out.println(name+" thread is ended");
	}

}
