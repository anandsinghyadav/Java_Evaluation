package com.question_3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
   
	public static void main(String[] args) {
		

		Set<Student> stu = new TreeSet<>(new StudentComp());
		stu.add(new Student(3, "anand", 30, 20, 50));
		stu.add(new Student(2, "pnand", 20, 50, 30));
		stu.add(new Student(4, "anand", 30, 20, 50));
		stu.add(new Student(5, "anand", 30, 20, 50));
		
		System.out.println(stu);
		
	}
	
}
