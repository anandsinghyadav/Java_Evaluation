package com.question_2;

public class Main {
	
	public static void main(String[] args){
		
		ThreadA a = new ThreadA();
		
		Thread t = new Thread(a);
		
		t.start();
		
		synchronized (a) {
			    try {
					a.wait();
					System.out.println("Product from 1 to 10 is: "+a.product);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
		
		
	}

}
