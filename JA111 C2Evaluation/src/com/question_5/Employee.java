package com.question_5;

public class Employee {
	
	private int employeedId;
	private String employeeName;
	private double salary;
	private double netSalary;
	

	public Employee() {
		// zero argument constructor
	}
	
	// parameterized constructor
	public Employee(int employeedId, String employeeName, double salary) {
		super();
		this.employeedId = employeedId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	// Getter and setter

	public int getEmployeedId() {
		return employeedId;
	}

	public void setEmployeedId(int employeedId) {
		this.employeedId = employeedId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public static int getPFPercentage(Employee e) 
	{
		
		return (int)(Math.round((1-(e.netSalary/e.salary))*100));
	}
	
	public void calculateNetSalary(int pfPercentage)
	{
		
		 double finalSalary = getSalary()-((getSalary())*pfPercentage)/100; 
		  
		 netSalary = finalSalary;
		 
		 //System.out.println(this.netSalary);
	
	}
	

	public static Employee getEmployeeDetails(int employeedId, String employeeName, double salary)
	{
		 Employee em = new Employee(employeedId,employeeName,salary);
		 return em;
	}

}

