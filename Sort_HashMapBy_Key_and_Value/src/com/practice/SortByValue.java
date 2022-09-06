package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortByValue {
	
	public static Map<String, Student> sortByMapValue(HashMap<String,Student> map){
		
//		Comparator<Map.Entry<String, Student>> marksComp = (s1,s2)->{
//			return s1.getValue().getMarks()>s2.getValue().getMarks()?1:-1;
//		};
		
		Set<Map.Entry<String, Student>> set=map.entrySet();
		
		Set<Map.Entry<String, Student>> sortedMap = new TreeSet<>(new StuedentComp());
		sortedMap.addAll(set);
		
		LinkedHashMap<String, Student> finalMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s: sortedMap) {
			finalMap.put(s.getKey(), s.getValue());
		}
		return finalMap;
		
	}
	
	public static void main(String[] args) {
		
		HashMap<String,Student> map = new HashMap<>();
		
		map.put("Delhi", new Student(23, "Mohit", 120));
		map.put("Noida", new Student(12, "Sita", 120));
		map.put("Kanpur", new Student(89, "Sunil", 789));
		map.put("Banaras", new Student(19, "Bamlesh", 489));
		map.put("Bihar", new Student(90, "Rakesh", 280));
		
		Map<String, Student> sortedMap = sortByMapValue(map);
		
		for(Map.Entry<String, Student> s: sortedMap.entrySet()) {
			
			System.out.println("Student is from: "+s.getKey());
			System.out.println("---------------------------------");
			Student stu = s.getValue();
			
			System.out.println("Student Name: "+stu.getName());
			System.out.println("Student RollNo: "+stu.getRollNo());
			System.out.println("Student Marks: "+stu.getMarks());
			System.out.println("------------------------------------");
		}
		
		
		
	}

}
