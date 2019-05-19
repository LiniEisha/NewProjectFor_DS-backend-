package org.EasyBooking.Details;

import java.awt.print.Book;

public class BookingDetails {
	
	private String from;
	private String to;
	private int noOfTickets;
	
	public BookingDetails() {}
	
	public BookingDetails(String from, String to, int noOfTickets) {
		super();
		this.from = from;
		this.to = to;
		this.noOfTickets = noOfTickets;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}


}
