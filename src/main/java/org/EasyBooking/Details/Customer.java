package org.EasyBooking.Details;

public class Customer {
	
	private String name;
	private String NIC;
	private String id;
	
	public Customer(String name, String nIC, String id) {
		this.name = name;
		this.NIC = nIC;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
