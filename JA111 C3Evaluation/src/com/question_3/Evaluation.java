package com.question_3;

public abstract class Evaluation {
	
	private final int numberOfQuestions;
	abstract void evaluationTiming();
	void printNoOfQuestions() {
	System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}
	
	public Evaluation(int question) {
		// TODO Auto-generated constructor stub
		this.numberOfQuestions=question;
	}

}
