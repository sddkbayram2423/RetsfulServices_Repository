package com.bayram.client;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class HavaDurumuRestfulJerseyClient {

	public static void main(String[] args) {

		getFtoC(74);
		System.out.println("\n---------------------------------------------\n");
		getCtoF(15);
		
	}
	public static void getFtoC(double fah) {
		
		try {
			Client client=Client.create();
			WebResource resource=client.resource("http://localhost:8090/rest/ftocservice/"+fah);
			ClientResponse clientResponse=resource.accept("application/xml").get(ClientResponse.class);
			if(clientResponse.getStatus()!=200) {
				throw new RuntimeException("Hata Oluþtu.Kodu: "+clientResponse.getStatus());
			}
			String gelenSonuç=clientResponse.getEntity(String.class);
			
			System.out.println(gelenSonuç);
			
		} catch (Exception e) {
			System.out.println("Hata..............: "+e);
			
		}
	
	}
	public static void getCtoF(double cel) {
		
		try {
			Client client=Client.create();
			WebResource resource=client.resource("http://localhost:8090/rest/ctofservice/"+cel);
			ClientResponse clientResponse=resource.accept("application/json").get(ClientResponse.class);
			if(clientResponse.getStatus()!=200) {
				throw new RuntimeException("Hata Oluþtu.Kodu: "+clientResponse.getStatus());
			}
			String gelenSonuç=clientResponse.getEntity(String.class);
			
			System.out.println(gelenSonuç);
			
		} catch (Exception e) {
			System.out.println("Hata..............: "+e);
			
		}
		
	}

}
