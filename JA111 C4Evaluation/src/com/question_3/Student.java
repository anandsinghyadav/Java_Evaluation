package com.question_3;

public class Student {
      
	private Integer rollNo;
	private String name;
	private Integer mathsMarks;
	private Integer scienceMarks;
	private Integer engMarks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer rollNo, String name, Integer mathsMarks, Integer scienceMarks, Integer engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
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

	public Integer getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(Integer mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public Integer getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(Integer scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public Integer getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(Integer engMarks) {
		this.engMarks = engMarks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}
	
	
	
}
