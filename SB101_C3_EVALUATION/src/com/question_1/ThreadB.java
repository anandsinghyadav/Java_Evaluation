package com.question_1;

class ThreadB extends Thread{
		A a1;
		B b1;
		
		public ThreadB(A a1,B b1) {
			
		this.b1=b1;
		this.a1=a1;
		
     }
		
		@Override
		public void run() {
		b1.funB(a1);
    }
		
}
