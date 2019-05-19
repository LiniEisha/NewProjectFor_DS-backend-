package org.EasyBooking.DSEasyBooking;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.EasyBooking.DBConnection.DBConnectionforCustomers;
import org.EasyBooking.Details.CalculateDiscount;
import org.EasyBooking.Details.Customer;
import org.EasyBooking.Details.Discount;


	@Path("/myresourceCustomer")
	public class MyReasource_Customer {
		
		List <Customer> customer;
		
		public MyReasource_Customer() {
			DBConnectionforCustomers cus = new DBConnectionforCustomers();
			customer = cus.getAllCustomers();
		}	
		
		 @Path("/allCustomers")
		    @GET
		    @Produces(MediaType.APPLICATION_JSON)
		    public Response getdiscount() {
		 
			  return Response.ok()
					  .entity(customer)
				      .header("Access-Control-Allow-Origin", "*")
				      .header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				      .header("Access-Control-Allow-Headers", "Content-Type")
				      .header("Access-Control-Allow-Headers", "Content-Type").allow("OPTIONS").build();
		    } 
		    
		  @Path("/employeediscount")
		    @POST
		    @Produces(MediaType.APPLICATION_JSON)
		    public CalculateDiscount getDiscount(Discount discount, @Context HttpServletResponse response, @Context HttpServletRequest request) {
		    	response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	

		    	String nic = discount.getnIC();
		    	double amount = discount.getAmount();
		    	int percentage = discount.getPercentage();
		    	CalculateDiscount discountCal = new CalculateDiscount();
		    	
		    	for(Customer c1 : customer) {
		    		if(c1. getNIC().equalsIgnoreCase(nic)) {
		    			discountCal = new CalculateDiscount( amount ,  percentage);
		    			discountCal.calculateDiscount();
		    			System.out.println("amount : " +amount);
		    			System.out.println("Precentage: " + percentage);
		    			System.out.println(discountCal.getTotPrice());
		    		}
		    	}
		    	return discountCal; 	
		  }
		  
		  @Path("/customerdiscount")
		    @OPTIONS
		    @Produces(MediaType.APPLICATION_JSON)
		    public Response getCustomerResponse(@Context HttpServletRequest request) {
		    	return Response.ok()
		    			.header("Access-Control-Allow-Origin", request.getHeader("Origin"))
		    			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
		    			.header("Access-Control-Allow-Headers", "content-type")
		    			.build();
		    }}
		  