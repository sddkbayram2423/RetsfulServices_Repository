package com.bayram.controller;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path(value = "/anasayfa")
public class MainPage {
	
	//http://localhost:8080/RestFulPathAnnotation/anasayfa/test
	@GET
	@Path(value = "/test")
	@Produces("text/html")
	public String test() {
		
		return "<font size='15' color='green'>Hello World</font>";
	}
	
	@GET
	public String test1() {
		
		return "Bayram1";
	}
	
	
	
	//http://localhost:8080/RestFulPathAnnotation/anasayfa/cevap/35
	@GET
	@Path("/cevap/{param}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Response getAnswer(@PathParam("param") String param) {
		
		String a="</br><font size='15' color='red'>Hello!! Siddik Bayram "+param+" </font>";
		
		return Response.status(200).entity(a).build();
	}
	
	
	
	
	
	
	
	//http://localhost:8080/RestFulPathAnnotation/anasayfa/kalem;adi=siddik;soyadi=Bayram;
	@GET
	@Path("/kalem")
	@Produces("text/plain")
	public Response getAnswer1(@MatrixParam("adi") String adi,
							   @MatrixParam("soyadi") String soyadi) {
		
		String a=adi+" "+" "+soyadi+" ";
		
		return Response.status(200).entity(a).build();
	}

	//http://localhost:8080/RestFulPathAnnotation/anasayfa/personel/detay;adi=Ali;soyadi=Bayram;ulke=Turkey
		@GET
		@Path("/personel/{detay}")
		@Produces("text/plain")
		public Response getInfo(@PathParam("detay") PathSegment detay) {
			
			String a="Personel: ";
			MultivaluedMap<String, String> matrix=detay.getMatrixParameters();
			
			for(String b:matrix.keySet()) {
				a+=" "+b+" "+matrix.get(b);
			}	
			return Response.status(200).entity(a).build();
		}

	
	
	

}
