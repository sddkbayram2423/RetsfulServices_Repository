package com.bayram.service;

import javax.ws.rs.GET;


import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


//Celcius to Fahrenayt
@Path("/ctofservice")
public class CtoFService {
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)//	@Produces("application/json")
	public String cToF() {
		
		double celcius=13.2;
		double fahrenayt;
		fahrenayt=(9*celcius)/5+32;
		return "<ctoservice>"
					+ "<celcius>"+celcius+"</celcius>"
					+ "<fahrenayt>"+fahrenayt+"</fahrenayt>"
				+ "</ctoservice>";
}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{cel}")
	public String cToF(@PathParam("cel") double celcius)  {
		
		
		double fahrenayt;
		fahrenayt=((9*celcius)/5)+32;
		
		return "<ctoservice>"
				+ "<celcius>"+celcius+"</celcius>"
				+ "<fahrenayt>"+fahrenayt+"</fahrenayt>"
				+ "</ctoservice>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response cToF1() {
		
		JSONObject jsonObject=new JSONObject();
		
		double celcius=13.2;
		double fahrenayt;
		fahrenayt=(9*celcius)/5+32;
		
		jsonObject.put("celcius", celcius);
		jsonObject.put("fahrenayt", fahrenayt);
		
		
		return Response.status(200).entity(jsonObject).build();
	
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{cel}")
	public Response cToF1(@PathParam("cel") double celcius)  {
		JSONObject jsonObject=new JSONObject();	
		double fahrenayt;
		fahrenayt=((9*celcius)/5)+32;
		jsonObject.put("celcius", celcius);
		jsonObject.put("fahrenayt", fahrenayt);
		
		return Response.status(200).entity(jsonObject).build();
	}
	

}
