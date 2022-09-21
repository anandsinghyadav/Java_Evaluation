package com.question_4;

public class Main {
	
	public static void main(String[] args) {
		
		
		ThreadB dhoni = new ThreadB();
		ThreadC rohit = new ThreadC(dhoni);
		ThreadA kohli = new ThreadA(rohit);
		

		kohli.setName("Kohli");
		dhoni.setName("Dhoni");
		rohit.setName("Rohit");
		
	    dhoni.setPriority(10);
	    
	    kohli.start();
	    dhoni.start();
	    rohit.start();
	    
	     
	    
		
	}

}
