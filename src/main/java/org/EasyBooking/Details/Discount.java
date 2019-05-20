package org.EasyBooking.Details;

public class Discount {
	
	private double amount;
	private int percentage;
	private String nIC;
	
	public Discount() {
		
	}
	
	public Discount(double amount, int percentage, String nIC) {
		super();
		this.amount = amount;
		percentage = percentage;
		this.nIC = nIC;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		percentage = percentage;
	}

	public String getnIC() {
		return nIC;
	}

	public void setnIC(String nIC) {
		this.nIC = nIC;
	}

	
	
}
