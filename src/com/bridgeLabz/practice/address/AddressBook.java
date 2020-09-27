package com.bridgeLabz.practice.address;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AddressBook {
	Set<Contact> Book = new HashSet<Contact>();
	
	public void addContact(Contact person)
	{
		Book.add(person);
		System.out.println("Contact added");
	}

}
