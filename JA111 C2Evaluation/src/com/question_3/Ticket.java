package com.question_3;

public class Ticket {
         
	private int ticketId;
	private int price;
	static int availableTickets;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Ticket(int ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}



	public int getTicketId() {
		return ticketId;
	}



	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public static int getAvailableTickets() {
		return availableTickets;
	}



	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}



	public int calculateTicketCost(int noOfTickets){
		int cost;
		if(noOfTickets<availableTickets) {
			cost = noOfTickets*price;
			availableTickets = availableTickets-noOfTickets;
			return cost;
		}
		else 
			return -1;
	}
	
}
