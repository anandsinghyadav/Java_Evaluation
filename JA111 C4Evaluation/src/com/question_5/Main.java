package com.question_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		String string = "hello Hello HEllo hi hi: hi! Welcome, welcome";
		
		char[] str = string.toCharArray();
		
	    List<Character> Clist = new ArrayList<>();
	    
	    List<String> list = new ArrayList<>();
	    
	    for(Character s:str) {
	    	if(s==','||s=='!'||s=='?'||s=='.'||s==':') {
	    		continue;
	    	}
	    	Clist.add(s);
	    	
	    }
	    
	    
	    // print
	    String temp ="";
	    for(Character s: Clist) {
	    	if(s==' ') {
	    		list.add(temp.toLowerCase());
	    		temp="";
	    		continue;
	    	}
	    	temp +=s;
	    }
	    
	    list.add(temp.toLowerCase());
	    
	    Collections.sort(list);
	    
	    System.out.println(list);
	    
	    int total = list.size();
	    
	    Set<String> set = new LinkedHashSet<>(list);
	    
	    int i=1;
	    for(String s: set) {
	       System.out.print(" "+i+". "+s);
	       i++;
	    }
	    System.out.println();
	     
	    int uniqueWords = set.size();
	    
	    System.out.println("Totol Words: "+total+" Unique Words: "+uniqueWords);
	    

	}

}
