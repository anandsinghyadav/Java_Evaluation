package com.question_5;

public class FuelCar implements Vehicle{
	
	@Override
	public void run() {
		System.out.println("Fuel Car is running....");
		
	}
	public void service() {
		System.out.println("Car needs service...");
	}

}
