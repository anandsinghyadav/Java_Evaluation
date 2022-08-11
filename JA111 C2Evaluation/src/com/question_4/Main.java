package com.question_4;

import java.util.Scanner;

public class Main {
	
	public static Laptop getLaptop(String laptopPurpose){
		
		   if(laptopPurpose.equals("gaming")) {
			   
			   Laptop gamingLaptop = new Laptop();
			   gamingLaptop.setColor("Black");
			   gamingLaptop.setCompanyName("Radeon");
			   gamingLaptop.setPurpose("gaming");
			   gamingLaptop.setName("Acer");
			   
			   CPU cpu = new CPU("Radeon","Ryzen 95800H", 3200);
			   gamingLaptop.setCpu(cpu);
			   GraphicCard graphic = new GraphicCard("Radeon", "RTX 3050 Ti","15GB");
			   gamingLaptop.setGraphicCard(graphic);
			   
			   return gamingLaptop;
		   }
		   else if(laptopPurpose.equals("business")) {
			   
			   Laptop businessLaptop = new Laptop();
			   businessLaptop.setColor("Rose Gold");
			   businessLaptop.setCompanyName("HP");
			   businessLaptop.setPurpose("business");
			   businessLaptop.setName("Aero 13");
			   
			   CPU cpu = new CPU("Intel","i5 10210U", 1800);
			   businessLaptop.setCpu(cpu);
			   GraphicCard graphic = new GraphicCard("Intel", "Lris Xe","Inegrated");
			   businessLaptop.setGraphicCard(graphic);
			   
			   return businessLaptop;
			   
		   }
		   else
			   return null;
		   
		}
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please Enter the purpose: ");
			String purpose = sc.nextLine();
			
			Laptop laptop=getLaptop(purpose);
			if(laptop!=null) {
				laptop.displayDetails();
			}
			else
				System.out.println("Please Enter the correct Purpose");
			}


}
