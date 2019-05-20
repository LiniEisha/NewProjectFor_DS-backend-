package org.EasyBooking.DSEasyBooking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.EasyBooking.Details.CalculateDiscount;
import org.EasyBooking.Details.CreditCardPayments;
import org.EasyBooking.Details.Customer;
import org.EasyBooking.Details.Discount;
import org.EasyBooking.Details.Email;
import org.EasyBooking.Details.MobilePayments;

@Path("/myresourcePayment")
public class MyResource_Payment {
	
	 @Path("/creditcard")
	    @POST
	    @Produces(MediaType.APPLICATION_JSON)
	    public String getDiscount(CreditCardPayments cc, @Context HttpServletResponse response, @Context HttpServletRequest request) {
	    	response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	    	
	    	 String cn = cc.getCn();
	    	 String cvc = cc.getCvc();
	    	 String expiry = cc.getExpiry();
	    	 String name = cc.getName();
	    	 double amount = cc.getAmount();
	    	 String email = cc.getEmail();
	    	 
	    	 CreditCardPayments ccObj = new CreditCardPayments(cn, cvc, expiry, name, amount, email);
	    	 String message = cn + " card payment (" + amount + ") for Easy Booking has been confirmed!";
	    	 Email sendmail = new Email(email, message);
	    	 	
	    	 String paymentResponse = "Email status : " + sendmail.sendMail() + ", SMS status : ";
	    	return paymentResponse;
	  }
	  
 @Path("/creditcard")
 @OPTIONS
 @Produces(MediaType.APPLICATION_JSON)
 public Response getCustomerResponse(@Context HttpServletRequest request) {
 	return Response.ok()
 			.header("Access-Control-Allow-Origin", request.getHeader("Origin"))
 			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
 			.header("Access-Control-Allow-Headers", "content-type")
 			.allow("OPTIONS").build();
 }

 		 @Path("/mobilePhone")
 		    @POST
 		    @Produces(MediaType.APPLICATION_JSON)
 		    public String getDiscount(MobilePayments mobile, @Context HttpServletResponse response, @Context HttpServletRequest request) {
 		    	response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
 		    	
 		    	 String name = mobile.getName();
 		    	 String mobileNumber = mobile.getMobileNumber();
 		    	 String email = mobile.getEmail();
 		    	 double amount = mobile.getAmount();
 		    	
 		    	 
 		    	MobilePayments mobileObj = new MobilePayments(name , mobileNumber , email , amount);
 		    	 String message = mobileNumber + " mobile payment (" + amount + ") for Easy Booking has been confirmed!";
 		    	 Email sendmail = new Email(email, message);
 		    	 	
 		    	 String paymentResponse = "Email status : " + sendmail.sendMail() + ", SMS status : ";
 		    	return paymentResponse;
 		  }
 		  
 	 @Path("/creditcard")
 	 @OPTIONS
 	 @Produces(MediaType.APPLICATION_JSON)
 	 public Response getCustomerResponsetosms(@Context HttpServletRequest request) {
 	 	return Response.ok()
 	 			.header("Access-Control-Allow-Origin", request.getHeader("Origin"))
 	 			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
 	 			.header("Access-Control-Allow-Headers", "content-type")
 	 			.build();
 	 }
 	
 	
 	
 	
}
