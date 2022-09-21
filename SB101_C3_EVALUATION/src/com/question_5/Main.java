package com.question_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	// for Serialization
	
	public static void main(String[] args)throws IOException {
		
		 List<Student> list = new ArrayList<>();
		 
		 list.add(new Student(34, "anand", 459, "anand@gmail.com", "anand123", new Address("UP", "Noida", "201301")));
		 list.add(new Student(12, "prince", 259, "prince@gmail.com", "prince123", new Address("MP", "Bhopal", "458821")));
		 list.add(new Student(17, "rohit", 129, "rohit@gmail.com", "rohit123", new Address("Bihar", "Siwan", "200192")));
		 list.add(new Student(89, "bamlesh", 759, "bamlesh@gmail.com", "bamlesh123", new Address("Delhi", "Delhi", "41301")));
		 list.add(new Student(13, "deepak", 959, "deepak@gmail.com", "deepak123", new Address("Mumbai", "Andheri", "876721")));
		
		
	     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
	     
	     oos.writeObject(list);
	     
	     oos.close();
	     System.out.println("Serialization is done");
	     
	     
	     
	     
	}

}
