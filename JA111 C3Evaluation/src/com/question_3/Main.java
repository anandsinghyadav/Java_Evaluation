package com.question_3;

public class Main {
	
	public static void maessageToStudents(Evaluation evaluation) {
		
		  if(evaluation instanceof DsaEvaluation) {
			  System.out.println("Its a DSA Evaluation.");
			  evaluation.printNoOfQuestions();
			  evaluation.evaluationTiming();
			  System.out.println("==================================");
		  }
		  if(evaluation instanceof CodingEvaluation) {
			  System.out.println("Its a Coding Evaluation");
			  evaluation.printNoOfQuestions();
			  evaluation.evaluationTiming();
			  System.out.println("=================================");
		  }
		
	}
	
	public static void main(String[] args) {
            maessageToStudents(new DsaEvaluation(5));
            maessageToStudents(new CodingEvaluation(4));
        
		}

}
