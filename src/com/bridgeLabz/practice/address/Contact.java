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
	
	public void print()
	{
		System.out.println("firstname: " + this.firstname);
		System.out.println("lastname: " + this.lastname);
		System.out.println("address: " + this.address);
		System.out.println("city: " + this.city);
		System.out.println("state: " + this.state);
		System.out.println("zip: " + this.zip);
		System.out.println("phone: " + this.phone);
		System.out.println("email " + this.email);


	}
	
	
}
