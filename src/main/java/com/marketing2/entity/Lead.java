package com.marketing2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name="first_name", nullable= false)
	private String first_name;
	
	@Column(name= "last_name", nullable = false)
	private String last_name;
	
	@Column(name="city", nullable = false)
	private String city;
	
	@Column(name= "mobile_number", nullable = false)
	private long mobile_number;
	
	
	@Column(name="email", nullable= false, unique= true)
	private String email;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
