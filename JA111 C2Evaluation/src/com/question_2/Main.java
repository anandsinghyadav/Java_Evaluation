package com.question_2;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
       
      System.out.println("Enter Number of Student, Do you want to add: ");
      int number = Integer.parseInt(sc.nextLine());
      int i=1;
      while(i<=number) {
    	  
    	  System.out.println("Enter Roll Number: ");
    	  int rollNumber = Integer.parseInt(sc.nextLine());
    	  
    	  System.out.println("Enter Name: ");
    	  String name = sc.nextLine();
    	  
    	  System.out.println("Enter Marks: ");
    	  int marks = Integer.parseInt(sc.nextLine());
    	  
    	  Student s1 = new Student(rollNumber,name,marks);
    	  
          System.out.println("Student Detail: "+i);
          System.out.println("Student Roll Number: "+s1.getRollNumber());
          System.out.println("Student Name: "+s1.getStudentName());
          System.out.println("Student Marks: "+s1.getMarks());
          System.out.println("==========================================");
    	  i++;
      }

	}

}
