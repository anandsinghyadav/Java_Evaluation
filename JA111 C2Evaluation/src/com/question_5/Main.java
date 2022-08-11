package com.question_5;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
	 Scanner id = new Scanner(System.in);
		 
		 System.out.println("Enter Id:");
	     int employeedId = id.nextInt();
	 
		 System.out.println("Enter Name:");	
		 String employeeName = id.next();
		 
		 id.nextLine();
		 
		 System.out.println("Enter Salary:");
		 double salary = id.nextDouble();
		 
		 System.out.println("Enter PF");
		 int pfPercentage = id.nextInt();
	  
		 	
		 Employee E1 = new Employee();
	 
		 E1.setEmployeedId(employeedId);
		 E1.setEmployeeName(employeeName);
		 E1.setSalary(salary);
	 
//		 int pf = Employee.getPFPercentage(pfPercentage);
		 E1.calculateNetSalary(pfPercentage);
		 
         System.out.println("------------------------------------");
		 
		 System.out.println("===Employee Details==========");
		 System.out.println("------------------------------------");
		 
		 System.out.println("Id :"+E1.getEmployeedId());
		 System.out.println("Name :"+E1.getEmployeeName());
		 System.out.println("Salary :"+E1.getSalary());
		 System.out.println("netSalary :"+E1.getNetSalary());
		 System.out.println("Net pf Percentage is:"+Employee.getPFPercentage(E1));
	
	 
     id.close();  
	}

}
