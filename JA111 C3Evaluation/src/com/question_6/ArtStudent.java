package com.question_6;

public class ArtStudent implements Student {
	
    private int hindi;
    private int english;
    private int history;
    
    public ArtStudent() {
		// TODO Auto-generated constructor stub
	}

	public ArtStudent(int hindi, int english, int history) {
		super();
		this.hindi = hindi;
		this.english = english;
		this.history = history;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
    
    @Override
    public double findPercentage() {
    	int total = english+hindi+history; 
		return total/3;
    }

}
