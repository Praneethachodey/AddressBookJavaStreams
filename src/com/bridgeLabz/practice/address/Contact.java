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

	public void print() {
		System.out.println("firstname: " + this.firstname);
		System.out.println("lastname: " + this.lastname);
		System.out.println("address: " + this.address);
		System.out.println("city: " + this.city);
		System.out.println("state: " + this.state);
		System.out.println("zip: " + this.zip);
		System.out.println("phone: " + this.phone);
		System.out.println("email " + this.email);

	}

	public boolean equals(Contact p) {
		if (this.lastname == p.lastname)
			return false;
		if (this.city == p.city)
			return false;
		if (this.state == p.state)
			return false;
		if (this.zip == p.zip)
			return false;
		if (this.address == p.address)
			return false;
		if (this.phone == p.phone)
			return false;
		if (this.email == p.email)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact : " + "firstname= " + firstname  + ", lastname= " + lastname + ", address="
				+ address + ", city=" + city  + ", state=" + state + ", zip=" + zip 
				+ ", number=" + phone  + ", email=" + email;
	}

}