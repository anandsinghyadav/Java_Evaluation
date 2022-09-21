package com.question_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable [] jobs = {
			       new MyCallable(5),
			       new MyCallable(10),
			       new MyCallable(15),
			       new MyCallable(20),
			       new MyCallable(25),
			       
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallable c: jobs) {
			Future ans = service.submit(c);
			
			System.out.println(ans.get());
		}
		
		service.shutdown();
		
		
	}

}
