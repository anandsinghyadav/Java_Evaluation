package com.question_4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	static List<Product> productList = new ArrayList<>();
	
	public void addToProductList(Product product) {
		int count=0;
		for(Product pro : productList) {
			if(pro.getCompany().equalsIgnoreCase(product.getCompany())&&pro.getName().equalsIgnoreCase(product.getName())&&pro.getPrice()==product.getPrice()) {
				pro.setCount(product.getCount()+1);
			    System.out.println("Count updated Product already exists");
			    count=1;
			}
		}
		if(count==0) {
			productList.add(product);
			System.out.println("Product is added successfully");
		}
		
	}
	
	public void showAllProduct() {
		for(Product pro : productList) {
			System.out.println(pro);
			System.out.println("-----------------");
		}
	}

}
