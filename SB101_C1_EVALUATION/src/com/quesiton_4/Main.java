package com.quesiton_4;

public class Main {
	
		public static void main(String args[])
		{
		try
		{
		System.out.print("A");
		int num = 99/0;
		System.out.print("B");
		}
		catch(ArithmeticException ex)
		{
		System.out.print("C");
		}
		catch(Exception ex)
		{
		System.out.print("D");
		}
		System.out.print("E");
		}
		
		/*Reason: Inside First try block It will print A then at line no:10 will throw Arithmetic Exception
		 * so after line no: 10 nothing will be printed. It will go directly to Arithmetic catch block and print
		 * C then It won't go to Exception catch as there is no such Exception happening. Then It will go out
		 * and print E so the final Output is : ACE
		 */

}
