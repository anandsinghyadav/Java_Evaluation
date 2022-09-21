package com.question_3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
  
	
	int num;
	
	public MyCallable(int n) {
		// TODO Auto-generated constructor stub
		this.num=n;
	}
	
	
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" is findding Product of first "+num+" numbers");
		
		long product =1;
		
		for(int i=1;i<=num;i++) {
		   product*=i;	
		}
		
     return product;

	}
	
	

}
