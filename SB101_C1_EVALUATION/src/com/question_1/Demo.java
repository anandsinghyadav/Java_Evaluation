package com.question_1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		  Comparator<Map.Entry<Employee, String>> marksComp= (e1,e2)->{
			  return e1.getKey().getSalary()>e2.getKey().getSalary()?1:-1;
		  };
		  
		  Set<Map.Entry<Employee,String>> set = originalMap.entrySet();
		  
		  Set<Map.Entry<Employee, String>> sortedSet = new TreeSet<>(marksComp);
		  sortedSet.addAll(set);
		  
		  LinkedHashMap<Employee, String> sortedMap = new LinkedHashMap<>();
		  
		  for(Map.Entry<Employee, String> s:sortedSet) {
			  sortedMap.put(s.getKey(), s.getValue());
		  }
		return sortedMap;
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(23, "Rakesh", 65888), "Delhi");
		map.put(new Employee(12, "Avdesh", 8452), "Kanpur");
		map.put(new Employee(19, "Raju", 97352), "Patna");
		map.put(new Employee(34, "Bamlesh", 1211), "Vanaras");
		map.put(new Employee(10, "Raghvendra", 78666), "Bihar");
		
		Map<Employee, String> finalMap = d.sortMapUsingEmployeeSalary(map);
		
		// for printing using enchance loop
		
		for(Map.Entry<Employee, String> l:finalMap.entrySet()) {
			System.out.println("Employee From: "+l.getValue());
			System.out.println("================================");
			Employee em = l.getKey();
			System.out.println("Employee Id: "+em.getEmpId());
			System.out.println("Employee Name: "+em.getName());
			System.out.println("Employee Salary: "+em.getSalary());
			System.out.println("----------------------------------");
		}
		
		
	}

	
}
