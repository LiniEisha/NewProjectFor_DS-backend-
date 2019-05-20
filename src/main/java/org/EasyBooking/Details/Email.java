package org.EasyBooking.Details;
import java.util.*;  
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
  
public class Email {
	
	private String to ;
	private String messagebody;
    private String host = "localhost";
    private String from = "linieesk@gmail.com";
	
	public Email(String to, String message){
		this.to= to;
		this.messagebody = message;
	}

	public String sendMail() {


	      Properties properties = System.getProperties();
	      properties.setProperty("mail.smtp.host", host);
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         MimeMessage message = new MimeMessage(session);

	         message.setFrom(new InternetAddress(from));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         message.setSubject("Easy Booking Confimation");

	         message.setText(messagebody);

	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	         return "Sent";

	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	         return "Email Failed";
	      }	   
		
	}
}