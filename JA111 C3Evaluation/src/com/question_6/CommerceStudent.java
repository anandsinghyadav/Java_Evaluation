package com.question_6;

public class CommerceStudent implements Student{
	
	private int accountMarks;
	private int economics;
	private int businessStudies;
	
    public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}
    
	public CommerceStudent(int accountMarks, int economics, int businessStudies) {
		super();
		this.accountMarks = accountMarks;
		this.economics = economics;
		this.businessStudies = businessStudies;
	}

	public int getAccountMarks() {
		return accountMarks;
	}


	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}


	public int getEconomics() {
		return economics;
	}


	public void setEconomics(int economics) {
		this.economics = economics;
	}


	public int getBusinessStudies() {
		return businessStudies;
	}


	public void setBusinessStudies(int businessStudies) {
		this.businessStudies = businessStudies;
	}


	@Override
	public double findPercentage() {
		int total = accountMarks+businessStudies+economics;
		return total/3;
	}

}
