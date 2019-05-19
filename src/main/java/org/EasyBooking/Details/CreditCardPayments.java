package org.EasyBooking.Details;

public class CreditCardPayments {
	private String cardNo;
	private String cvcNo;
	private String expDate;
	private String cardHolder;
	private double amount;
	private String email;
	
	public CreditCardPayments(String cardNo, String cvcNo, String expDate, String cardHolder, double amount, String email) {
		super();
		this.cardNo = cardNo;
		this.cvcNo = cvcNo;
		this.expDate = expDate;
		this.cardHolder = cardHolder;
		this.amount = amount;
		this.email = email;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCvcNo() {
		return cvcNo;
	}

	public void setCvcNo(String cvcNo) {
		this.cvcNo = cvcNo;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
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
	
	

}
