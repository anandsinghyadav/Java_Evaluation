package com.question_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Anand",540, "Noida"));
		students.add(new Student(11, "Prince", 280, "Delhi"));
		students.add(new Student(34, "Rakesh", 765, "Punjab"));
		students.add(new Student(78, "Suresh",236,"Haryana"));
		students.add(new Student(10, "Sita", 509, "Bihar"));
		
		students.forEach(System.out::println);
		System.out.println("===========After Updation==========");
		List<Employee> emList = students.stream().filter(i->i.
				getMarks()>500).map(i->new Employee(i.getRoll(), i.getName(), 
						i.getMarks()*1000, i.getAddress())).collect(Collectors.toList());
		emList.forEach(i->System.out.println(i));
	}

	
	                                                                                                                                                                           

}
