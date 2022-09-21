package com.question_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Main2 {
	 // Desrialization
	
	public static void main(String[] args)throws IOException {
		
		
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
	
	
		try {
			List<Student> ob = (List<Student>) ois.readObject();
			
			ob.add(new Student(3, "raghav", 342, "ragahv@123", "raghav123", new Address("MP", "HPP", "478989")));
			
		   for(Student s: ob) {
			   System.out.println(s.getName());
				System.out.println(s.getAddress());
				System.out.println(s.getPassword());
				System.out.println("-------------------");
		   }

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
