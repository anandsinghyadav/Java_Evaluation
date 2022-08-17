package com.question_6;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static double getStudent(int choice ) {
		
		if(choice==1) {
			
			System.out.println("Enter the Marks for Hindi: ");
			int hindi = sc.nextInt();
			System.out.println("Enter the Marks for English: ");
			int english = sc.nextInt();
			System.out.println("Enter the Marks for History: ");
			int history = sc.nextInt();
			Student marks = new ArtStudent(hindi,english ,history);
			return marks.findPercentage();
		}
		else if(choice ==2) {
			System.out.println("Enter the Marks for Maths: ");
			int maths = sc.nextInt();
			System.out.println("Enter the Marks for Chemistry: ");
			int chemistry = sc.nextInt();
			System.out.println("Enter the Marks for Physics: ");
			int physics = sc.nextInt();
			System.out.println("Enter the Marks for Biology: ");
			int biology = sc.nextInt();
			Student marks = new ScienceStudent(maths, chemistry, physics, biology);
			return marks.findPercentage();
		}
		else if(choice ==3) {
			System.out.println("Enter the Marks for Account: ");
			int account = sc.nextInt();
			System.out.println("Enter the Marks for Economics: ");
			int economics = sc.nextInt();
			System.out.println("Enter the Marks for Business Studies: ");
			int businessStudies = sc.nextInt();
			CommerceStudent marks = new CommerceStudent(account, economics, businessStudies);
			return marks.findPercentage();
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Student percentage do you want to find: "+
		   "\n 1. ArtStudent"+
		   "\n 2. ScienceStudent"+
		   "\n 3. CommerceStudent ");
		
		int choice = sc.nextInt();
		double percetange =getStudent(choice);
		if(percetange==0) 
			System.out.println("Please enter correct option");
		else {
			System.out.println("============================");
		    System.out.println("Percentage is: "+percetange);
		}
		
	}

}
