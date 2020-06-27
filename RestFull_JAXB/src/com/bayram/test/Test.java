package com.bayram.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.bayram.model.User;

public class Test {

	public static void main(String[] args) {
		
		try {
			URL url=new URL("http://localhost:8080/RestFull_JAXB/rest/user/bilgi1/25");
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Accept", "aplication/xml");
			
			if(connection.getResponseCode()!=200) {
				throw new RuntimeException("Hata meydana geldi: "+connection.getResponseCode());
				
			}
			
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String sonuç=bufferedReader.readLine();
			System.out.println(sonuç);
			connection.disconnect();
			
			JAXBContext jaxbContext=JAXBContext.newInstance(User.class);
			Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
			
			User user=(User) unmarshaller.unmarshal(new StringReader(sonuç));
			
			System.out.println(user);
	
			
		} catch (Exception e) {
			System.out.println("Hata :"+e);
		}

	}

}
