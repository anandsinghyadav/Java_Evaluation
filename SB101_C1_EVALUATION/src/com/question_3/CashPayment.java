package com.question_3;

public class CashPayment implements Payment{
	
	private int amount;
	
	public CashPayment(int amt) {
		this.amount = amt;
	}

	@Override
	public void doPayment() {
		System.out.println("Payment done using Cash "+amount);
	}
	

}
