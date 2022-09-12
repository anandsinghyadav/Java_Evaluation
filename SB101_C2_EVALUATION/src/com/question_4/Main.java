package com.question_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("deepak","Vikash","kunal","ram","anand","prakash","chanchal","sunil","pankaj","sita");
		System.out.println("Before Transformation");
		System.out.println("---------------------------");
		names.forEach(System.out::println);
		System.out.println("===========================");
		List<String> transformedName = names.stream().filter(i->i.length()%2==0).map(i->i.toUpperCase()).sorted((n1,n2)->n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println("After Transformation");
		System.out.println("----------------------------");
	    transformedName.forEach(System.out::println);
	    
		
	}

}
