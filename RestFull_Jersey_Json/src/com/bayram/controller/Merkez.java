package com.bayram.controller;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Merkez {

	public static void main(String[] args) {
		
		try {
			
			Client client=Client.create();
			WebResource resource=client.resource("");
			ClientResponse clientResponse=resource.accept("aplication/json").get(ClientResponse.class);
			if(clientResponse.getStatus()!=200) {
				throw new RuntimeException("Hata ");
			}else {
				String sonuç=clientResponse.getEntity(String.class);
				System.out.println(sonuç);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
	}

}
