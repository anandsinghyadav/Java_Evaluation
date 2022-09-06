package com.practice;

public class Student {
	private Integer rollNo;
	private String name;
	private Integer marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer rollNo, String name, Integer marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	

}
