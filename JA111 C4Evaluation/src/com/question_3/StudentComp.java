package com.question_3;

import java.util.Comparator;

public class StudentComp implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {

       int total1 = o1.getEngMarks()+o1.getMathsMarks()+o1.getScienceMarks();
       int total2 = o2.getEngMarks()+o2.getMathsMarks()+o2.getScienceMarks();
       if(total1==total2) {
    	        if(o1.getName().equalsIgnoreCase(o2.getName())) {
    	        	return o1.getRollNo()-o2.getRollNo();
    	        }
    	        else {
    	        	return -1*(o1.getName().compareTo(o2.getName())); // decending order
    	        }
    	        
       }
       else if(total1>total2) {
    	   return 1;
       }
       else {
    	   return -1;
       }
	}

}
