package org.EasyBooking.Details;

public class Discount {
	
	private double amount;
	private int Percentage;
	private String nIC;
	
	public Discount(double amount, int percentage, String nIC) {
		super();
		this.amount = amount;
		Percentage = percentage;
		this.nIC = nIC;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPercentage() {
		return Percentage;
	}

	public void setPercentage(int percentage) {
		Percentage = percentage;
	}

	public String getnIC() {
		return nIC;
	}

	public void setnIC(String nIC) {
		this.nIC = nIC;
	}

	
	
}
