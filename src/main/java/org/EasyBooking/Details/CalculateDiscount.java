package org.EasyBooking.Details;

public class CalculateDiscount {
	
	private double totPrice;
	private double amount;
	private double percentage;
	private double discount;
	
	public CalculateDiscount() {}
	
	public CalculateDiscount(double totPrice, double amount, double percentage, double discount) {
		super();
		this.totPrice = totPrice;
		this.amount = amount;
		this.percentage = percentage;
		this.discount = discount;
	}

	public CalculateDiscount(double amount, double percentage) {
		super();
		this.amount = amount;
		this.percentage = percentage;
	}
	
	public double getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(double totPrice) {
		this.totPrice = totPrice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public void calculateDiscount() {
		discount = (amount * percentage)* 100.0;
		totPrice = amount - discount; 
	}

}
