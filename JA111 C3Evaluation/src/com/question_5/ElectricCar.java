package com.question_5;

public class ElectricCar implements Vehicle{
	
	@Override
	public void run() {
		System.out.println("Electric car is running....");
		
	}
	
	public void service() {
		System.out.println("Car needs Service");
	}
 
}
