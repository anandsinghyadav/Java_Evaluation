package com.question_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String =>");
		String string = sc.nextLine();
		
		System.out.println("Enter the position =>");
		int position = Integer.parseInt(sc.nextLine());
		
		while(true) {
			if(position>string.length()) {
				System.out.println("Invalid Position, Please enter a valid position =>");
				position = Integer.parseInt(sc.nextLine());
			}
			else {
				char ch = string.charAt(position-1);
				System.out.println("Character at the position "+position+" =>"+" "+ch);
				break;
			}
		}
	}

}
