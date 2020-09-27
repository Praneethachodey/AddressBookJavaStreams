package com.bridgeLabz.practice.address;

public class Contact {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	String zip;
	String phone;
	String email;
	
	public Contact(String firstname, String lastname, String address, String city, String state, String zip,
			String phone, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		System.out.println("Contact created");
	}
	
	
}
