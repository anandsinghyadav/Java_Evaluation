package com.question_4;

public class Main {
	
	public static void main(String[] args) {
		
		Ecommerce ecom = new Ecommerce();
		
		ecom.addToProductList(new Product("Rakesh Kumar", 35244, "apple", 2));
		ecom.addToProductList(new Product("Rakesh Kumar", 35244, "apple", 2));
		ecom.addToProductList(new Product("Anand Singh Yadav", 45123, "nokia", 3));
		ecom.showAllProduct();
		
		
	}
	
	
	
	

}
