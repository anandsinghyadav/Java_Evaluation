package com.question_3;

public class CardPayment implements Payment{
	private int amount;
	
	public CardPayment(int amt) {
		this.amount=amt;
	}

	@Override
	public void doPayment() {
		System.out.println("Payment done using Card "+amount);
		
	}
	
	

}
