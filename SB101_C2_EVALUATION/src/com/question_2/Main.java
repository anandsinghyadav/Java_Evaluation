package com.question_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.question_3.Student;

 public class Main {

	public static void main(String[] args) {
		
         List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Anand",540, "Noida"));
		students.add(new Student(11, "Prince", 280, "Delhi"));
		students.add(new Student(34, "Rakesh", 765, "Punjab"));
		students.add(new Student(78, "Suresh",236,"Haryana"));
		students.add(new Student(10, "Sita", 509, "Bihar"));
		
		
		// First use of Predicate:
		//Let's get those students whose marks are less than 500
		System.out.println("Getting Students whose marks are less than 500 using Predicate");
		System.out.println("======================================================");
		students.stream().filter(i->i.getMarks()<500).forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		
		// Second use of Consumer
		// Let's print the details of student
		  System.out.println("Getting all students details using Consumer");
		  System.out.println("=============================================");
		 students.forEach(i->System.out.println(i));
		 System.out.println("------------------------------------------------");
		 
		// Third use of Supplier:
		 //get the student object with all details:
		 System.out.println("Getting Student object with all detail using Supplier");
		 System.out.println("=======================================================");
		 Supplier<Student> stu = ()->new Student(23, "Anand", 590, "Noida");
         System.out.println(stu.get());
         System.out.println("-----------------------------------------------------");
         
         
         //Fourth use of Function
         //get any number in String format and return the number in Integer format.
          
         //String s = "2";
         
          System.out.println("Converting String to number using Function:");
          System.out.println("==================================================");
         
          Function<String, Integer> f2 = s -> Integer.parseInt(s);
          System.out.println(f2.apply("2"));
          System.out.println("----------------------------------------------------");
  
        

		
		
	}

}
