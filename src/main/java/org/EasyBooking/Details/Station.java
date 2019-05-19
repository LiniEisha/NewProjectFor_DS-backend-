package org.EasyBooking.Details;

public class Station {
	
	private String Id;
	private String code;
	private String name;
	
	public Station(String id, String d, String name) {
		super();
		Id = id;
		this.code = d;
		this.name = name;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	

}
