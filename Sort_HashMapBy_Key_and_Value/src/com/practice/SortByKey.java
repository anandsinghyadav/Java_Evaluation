package com.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortByKey {
	
	public static void main(String[] args) {
		
        HashMap<Student, String> map = new HashMap<>();
		
		map.put(new Student(23, "Mohit", 120),"Delhi");
		map.put(new Student(12, "Sita", 120),"Noida");
		map.put(new Student(89, "Sunil", 789),"Kanpur");
		map.put(new Student(19, "Bamlesh", 489),"Banaras");
		map.put(new Student(90, ",Rakesh", 280),"Bihar");
		
		
	   Set<Map.Entry<Student, String>> set = 	map.entrySet();
	   
	   Comparator<Map.Entry<Student, String>> stuC = (s1,s2)->{
		   return s1.getKey().getMarks()>s2.getKey().getMarks()?1:-1;
	   };
	   
	   Set<Map.Entry<Student, String>> sortedSet= new TreeSet<>(stuC);
	   sortedSet.addAll(set);
		
	   LinkedHashMap<Student, String> finalMap = new LinkedHashMap<>();
	   
	   for(Map.Entry<Student, String> s: sortedSet) {
		   finalMap.put(s.getKey(), s.getValue());
	   }
	   
		
		
		for(Map.Entry<Student, String> m : finalMap.entrySet()) {
			
			System.out.println("Student is from: "+m.getValue());
              Student stu = m.getKey();
			
			System.out.println("Student Name: "+stu.getName());
			System.out.println("Student RollNo: "+stu.getRollNo());
			System.out.println("Student Marks: "+stu.getMarks());
			System.out.println("------------------------------------");
		}
		
		
		
	}
	
	

}
