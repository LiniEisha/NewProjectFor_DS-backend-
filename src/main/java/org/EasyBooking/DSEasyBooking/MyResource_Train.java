package org.EasyBooking.DSEasyBooking;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.ParserDelegator;

import org.EasyBooking.DBConnection.DBConnectionforStations;
import org.EasyBooking.Details.BookingDetails;
import org.EasyBooking.Details.Station;
import org.EasyBooking.Details.TicketCalculation;

/**
 * Root resource (exposed at "myresourceTrain" path)
 */
@Path("/myresourceTrain")
public class MyResource_Train {

	List<Station> stations;

	public MyResource_Train() {

		DBConnectionforStations stnd = new DBConnectionforStations();
		stations = stnd.getAllStations();
	}

	@Path("/allstations")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllStations() {
		return Response.ok().entity(stations).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type").allow("OPTIONS").build();
	}

	@Path("/getprice")
	@OPTIONS
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPrice(@Context HttpServletRequest request) {
		return Response.ok().header("Access-Control-Allow-Origin", request.getHeader("Origin"))
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "content-type").allow("OPTIONS").build();
	}
  @Path("/getprice")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public TicketCalculation getPrice(BookingDetails details,  @Context HttpServletResponse response, @Context HttpServletRequest request) {
	  response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	  Station trainfrom = null;
	  Station trainto = null;
	  
	  String to = details.getTo();
	  String from = details.getFrom();
	  int tickets = details.getNoOfTickets();	  
	  System.out.println("Tickets : " + tickets);
	 
		for(Station s1: stations) {
			if(s1.getName().equalsIgnoreCase(to)) {
				System.out.println("Go to: " +  to + " code " + s1.getCode());	
				trainfrom = s1;
			}
		}
		for(Station s2: stations) {
			if(s2.getName().equalsIgnoreCase(from)) {
				System.out.println("Go to: " +  to + " code " + s2.getCode());	
				trainto = s2;
			}
		}
		
		TicketCalculation ticket = new TicketCalculation(Double.parseDouble(trainfrom.getCode()), Double.parseDouble(trainto.getCode()) , tickets);
		ticket.calculateTotalPrice();
	  
		return ticket;

		}
	}