package org.EasyBooking.Details;

public class CreditCardPayments {
	private String cn;
	private String cvc;
	private String expiry;
	private String name;
	private double amount;
	private String email;
	public CreditCardPayments() {}
	
	public CreditCardPayments(String cn, String cvc, String expiry, String name, double amount, String email) {
		super();
		this.cn = cn;
		this.cvc = cvc;
		this.expiry = expiry;
		this.name = name;
		this.amount = amount;
		this.email = email;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void payAndSend() {
		
	}

}
