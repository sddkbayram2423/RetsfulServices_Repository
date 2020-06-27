package com.bayram.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

// Fahrenayt to Celcius
@Path("/ftocservice")
public class FtoCService {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response fToC() {
		double celcius;
		double fahrenayt=98.24;
		celcius=(fahrenayt-32)*5/9;
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("F Value", fahrenayt);
		jsonObject.put("C Value", celcius);
		
		
		return Response.status(200).entity(jsonObject).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{f}")
	public Response fToC(@PathParam("f") double f)  {
		
		JSONObject jsonObject=new JSONObject();
		
		double celcius;
		celcius=(f-32)*5/9;
				
		jsonObject.put("F Value", f);
		jsonObject.put("C Value", celcius);
		
		
		return Response.status(200).entity(jsonObject).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String fToC1() {
		double celcius;
		double fahrenayt=98.24;
		celcius=(fahrenayt-32)*5/9;
		
		return "<ctoservice>"
					+ "<celcius>"+celcius+"</celcius>"
					+ "<fahrenayt>"+fahrenayt+"</fahrenayt>"
				+ "</ctoservice>";
	}
	
	
	//	http://localhost:8080/RestfulServise/rest/ftocservice/15
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{f}")
	public String fToC1(@PathParam("f") double fahrenayt)  {
		
		double celcius;
		celcius=(fahrenayt-32)*5/9;
				
		return "<ctoservice>"
				+ "<celcius>"+celcius+"</celcius>"
				+ "<fahrenayt>"+fahrenayt+"</fahrenayt>"
				+ "</ctoservice>";
	}

}
