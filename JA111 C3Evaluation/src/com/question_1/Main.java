package com.question_1;

import java.util.Scanner;

public class Main {
	
	
	public static Object[] changeArray(Object[] obj) {
		     int index =0;
		     for(Object ob : obj) {
		    	 if(ob instanceof Student) {
		    		 Student student = (Student)ob;
		    		 student.setMarks(student.getMarks()+10);
		    	 }
		    	 else if(ob instanceof Employee) {
		    		 Employee employee = (Employee)ob;
		    		 employee.setSalary(employee.getSalary()+10000);
		    	 }
		    	 else if(ob instanceof String) {
		    		 String string = (String)ob;
		    		 StringBuilder sb = new StringBuilder(string);
		    		 sb.reverse();
		    		 obj[index]=sb;
		    	 }
		    	 else if(ob instanceof Integer) {
		    		 Integer integer = (Integer)ob;
		    		 obj[index] = integer+ 20;
		    	 }
		    	 index++;
		     }
		     return obj;
		     
	}

	
	public static void main(String[] args) {
		
		Object[] obj = {new Student(23, "Rakesh", 450),new Employee(12, "Lokesh", 84000),"String",50};
		
		System.out.println("Before updating....");
		for(Object ob : obj) {
			System.out.println(ob);
		}
	
		Object[] object = changeArray(obj);
		
		// for printing
		System.out.println("After updating....");
		for(Object ob : object) {
			System.out.println(ob);
		}
		
	}


}
		