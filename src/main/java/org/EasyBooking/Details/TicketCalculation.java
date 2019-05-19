package org.EasyBooking.Details;

public class TicketCalculation {
	
	private double goFrom = 0;
	private double goT0 = 0;
	private int noOfTicktest = 0;
	private double totPrice = 0;
	
	public TicketCalculation(double goFrom, double goT0, int noOfTicktest) {
		this.goFrom = goFrom;
		this.goT0 = goT0;
		this.noOfTicktest = noOfTicktest;
	}

	public double getGoFrom() {
		return goFrom;
	}

	public void setGoFrom(double goFrom) {
		this.goFrom = goFrom;
	}

	public double getGoT0() {
		return goT0;
	}

	public void setGoT0(double goT0) {
		this.goT0 = goT0;
	}

	public int getNoOfTicktest() {
		return noOfTicktest;
	}

	public void setNoOfTicktest(int noOfTicktest) {
		this.noOfTicktest = noOfTicktest;
	}

	public double getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(double totPrice) {
		this.totPrice = totPrice;
	}
	
	
	public void calculateTotalPrice() {
		totPrice = this.goFrom + this.goT0;
		totPrice = totPrice * noOfTicktest;
	}
	

}
