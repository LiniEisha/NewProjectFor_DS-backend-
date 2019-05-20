package org.EasyBooking.Details;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMS {
	
	private String to ;
	private String messagebody;
	private String from = "+13084554208";
	 
	public SMS(String to, String message){
		this.to= to;
		this.messagebody = message;
	}
	

	public String sendSMS() {
		String ACCOUNT_SID = "ACd5253562ebb05a2f88cc80c2fc13765b";
	    String AUTH_TOKEN = "695b701fa0ae4abd63ccb83b1ce8b144";
	    
	   
	        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        Message message = Message.creator(
	                new com.twilio.type.PhoneNumber("+94774558351"),
	                new com.twilio.type.PhoneNumber("+13084554208"),
	                "This is the confermation code for your  Easy Booking service!")
	            .create();

	        System.out.println(message.getSid());
			return "Message Sent";
	    	
	    }
	}
	

}
