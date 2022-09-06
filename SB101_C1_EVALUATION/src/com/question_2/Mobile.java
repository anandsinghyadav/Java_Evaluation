package com.question_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mobile {
	
	static HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
	      
		  for(Map.Entry<String, ArrayList<String>> s: mobiles.entrySet()) {
			  if(s.getKey().contains(company)) {
				  s.getValue().add(model);
				  return "Mobile Added Successfully";
			  }
		  }
		  ArrayList<String> s = new ArrayList<>();
		  s.add(model);
		  mobiles.put(company,s);
		  
		  return "Mobile Added Successfully";
		  
		
	}
	
	public List<String> getMobile(String company){
		List<String> models = new ArrayList<>();
		
		for(Map.Entry<String, ArrayList<String>> s: mobiles.entrySet()) {
			   if(s.getKey().contains(company)) {
				   for(String sub:s.getValue()) {
					   models.add(sub);
				   }
			   }
		}
		return models;
	}
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		System.out.println(m.addMobile("Apple", "iphone13"));
		System.out.println(m.addMobile("Nokia", "nokia5233"));
		System.out.println(m.addMobile("Apple", "iphone12"));
		System.out.println(m.addMobile("Vivo", "v21"));
		System.out.println(m.addMobile("Oppo", "Reno621"));
		System.out.println(m.addMobile("Vivo", "v24"));
		System.out.println("Available Stock---------------");
		System.out.println(mobiles);
		System.out.println("---------------------------------");
		List<String> result =m.getMobile("Samsung");
		if(result.size()==0) {
			System.out.println("No models available with this company..");
		}
		else
		System.out.println(result);
		
	}
	
	

}
