package com.question_3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of bookings: ");
		int booking = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the available tickets: ");
		int availableTickets = Integer.parseInt(sc.nextLine());
		Ticket.setAvailableTickets(availableTickets);
		
		while(booking>0) {
			System.out.println("Enter the ticketsId: ");
			int ticketId = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the price: ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the no of tickets: ");
			int noOfTickets = Integer.parseInt(sc.nextLine());
			
			Ticket t1 = new Ticket(ticketId, price);
			System.out.println("Available Tickets: "+t1.getAvailableTickets());
			int totalCost = t1.calculateTicketCost(noOfTickets);
			if(totalCost!=-1) {
			System.out.println("Total Amounts: "+totalCost);
			System.out.println("Available Tickets after Bookings: "+t1.getAvailableTickets());
			System.out.println("================================================");
			}
			else {
				System.out.println("Enter Tickets less thank Equals to Available Tickets.");
			}
		    booking--;
		
					
		}
		System.out.println("Thank you for booking......");
		
	}

}
