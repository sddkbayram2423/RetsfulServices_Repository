package com.bayram.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "personel")
public class Personel {
	
	@XmlElement
	private int id;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String number;
	
	public Personel() {
	}

	public Personel(int id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
	
	
	
	

}
