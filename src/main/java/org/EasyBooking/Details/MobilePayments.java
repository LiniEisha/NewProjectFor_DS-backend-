package org.EasyBooking.Details;

public class MobilePayments {
	private String Name;
	private String mobileNumber;
	private String email;
	private double amount;
	
	public MobilePayments(String name, String mobileNumber, String email, double amount) {
		super();
		Name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.amount = amount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
