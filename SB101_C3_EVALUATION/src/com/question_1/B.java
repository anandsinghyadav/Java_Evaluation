package com.question_1;

public class B {
      
	public synchronized void funB(A a1){
		
		System.out.println("funB of B starts");
		
		a1.fun1();
		
		System.out.println("funB of B ends");
		
      }
		public synchronized void fun2(){
		System.out.println("inside fun2 of B");
	
	}

	
}
