package com.bayram.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "musteri")
public class Musteri {
	
	
	@XmlElement
	private int iD;
	@XmlElement
	private String name;
	@XmlElement
	private String number;
	
	public Musteri() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Musteri(int iD, String name, String number) {
		this.iD = iD;
		this.name = name;
		this.number = number;
	}

}
