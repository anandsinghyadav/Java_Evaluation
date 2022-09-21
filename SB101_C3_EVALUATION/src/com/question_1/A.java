package com.question_1;

public class A {
	
	public synchronized void funA(B b1){
		
		System.out.println("funA of A starts");
		
		b1.fun2();
		
		System.out.println("funA of A ends");
		
		}
	
		public  void fun1(){
			
		System.out.println("inside fun1 of A");
		
   }


}
