package com.bayram.client;


import java.io.BufferedReader;

import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


public class HavaDurumuRESTfulApacheHTTPClient {

	public static void main(String[] args) {

		getFtoC(74);
		System.out.println("\n---------------------------------------------\n");
		getCtoF(15);
		
	}
	
	public static void getFtoC(double fah) {
		
		try {
			
			HttpClient client2=HttpClientBuilder.create().build();
			HttpGet httpGet=new HttpGet("http://localhost:8090/rest/ftocservice/"+fah);
			httpGet.addHeader("accept", "application/xml");
			HttpResponse httpResponse=client2.execute(httpGet);
			
			
			if(httpResponse.getStatusLine().getStatusCode()!=200) {
				throw new RuntimeException("Hata Oluþtu.Kodu: "+httpResponse.getStatusLine().getStatusCode());
			}
			BufferedReader reader=new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			String sonuç=reader.readLine();
			while (sonuç!=null) {
				System.out.println(sonuç);
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Hata..............: "+e);
			
		}
	
	}
	public static void getCtoF(double cel) {
		
		try {
				
			
			HttpClient client2=HttpClientBuilder.create().build();
			HttpGet httpGet=new HttpGet("http://localhost:8090/rest/ctofservice/"+cel);
			httpGet.addHeader("accept", "application/xml");
			HttpResponse httpResponse=client2.execute(httpGet);
			
			
			if(httpResponse.getStatusLine().getStatusCode()!=200) {
				throw new RuntimeException("Hata Oluþtu.Kodu: "+httpResponse.getStatusLine().getStatusCode());
			}
			BufferedReader reader=new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			String sonuç=reader.readLine();
			while (sonuç!=null) {
				System.out.println(sonuç);
				
			}
			
			
		} catch (Exception e) {
			System.out.println("Hata..............: "+e);
			
		}
		
	}

}
