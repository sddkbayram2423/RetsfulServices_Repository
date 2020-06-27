package com.bayram.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@XmlElement
	private int id;
	@XmlElement
	private String adi;
	@XmlElement
	private String soyadi;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String adi, String soyadi) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	
	
	
	
	

}
