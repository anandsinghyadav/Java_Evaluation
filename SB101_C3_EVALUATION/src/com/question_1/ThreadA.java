package com.question_1;

class ThreadA extends Thread{
		A a1;
		B b1;
		
		public ThreadA(A a1,B b1) {
			
		this.b1=b1;
		this.a1=a1;
		
    }
		
		@Override
		public void run() {
			
		a1.funA(b1);
		
     }
		
}
